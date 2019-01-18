package com.github.javadev.wsdlcodegenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import org.apache.commons.io.IOUtils;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugin.logging.SystemStreamLog;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.resource.loader.StringResourceLoader;
import org.apache.velocity.runtime.resource.util.StringResourceRepository;

public class FlrGenerator {

    private static final Pattern TWO_NUMBERS = Pattern.compile("([0-9]+)\\s*\\,\\s*([0-9]+)");
    private final String basedir;
    private final List<String> files;
    private final String outPackage;
    private Log log;

    public FlrGenerator(String basedir, List<String> files, String outPackage)
    {
        this.basedir = basedir;
        this.files = files;
        this.outPackage = outPackage;
    }

    public Log getLog() {
        if (log == null) {
            log = new SystemStreamLog();
        }
        return log;
    }

    public void generate()
    {
        generateJava();
    }

    private void generateJava()
    {
        Properties p = new Properties();
        p.setProperty("resource.loader", "string");
        p.setProperty("resource.loader.class", "org.apache.velocity.runtime.resource.loader.StringResourceLoader");
        Velocity.init(p);

        Template templateGenerator = getTemplate("BigDecimalConverter.java");
        VelocityContext context = new VelocityContext();
        context.put("package", outPackage);
        try {
            String outDirs = basedir + "/target/generated-sources/flrmodels/" + outPackage.replaceAll("\\.", "/");
            new File(outDirs).mkdirs();
            try (Writer writer = new OutputStreamWriter(new FileOutputStream(outDirs + "/"
                    + "BigDecimalConverter.java"), "utf-8")) {
                templateGenerator.merge(context, writer);
                writer.flush();
            }
        } catch (IOException e) {
            getLog().error(e);
        }
        Template template = getTemplate("FlrDataType.java");
        for (String file : files) {
            context.put("classname", file);
            context.put("package", outPackage);
            try (
                Reader reader = Files.newBufferedReader(Paths.get(basedir + "/src/main/csvfiles/" + file + ".csv"));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withHeader("#", "Field", "Description", "Type", "Length", "Pos", "Req", "Comment")
                    .withFirstRecordAsHeader()
                    .withTrim()
                );
             ) {
                context.put("variables", generateVariables(csvParser));
            } catch (IOException ex) {
                getLog().error(ex);
            }
            try {
                String outDirs = basedir + "/target/generated-sources/flrmodels/" + outPackage.replaceAll("\\.", "/");
                new File(outDirs).mkdirs();
                try (Writer writer = new OutputStreamWriter(new FileOutputStream(outDirs + "/"
                        + file + ".java"), "utf-8")) {
                    template.merge(context, writer);
                    writer.flush();
                }
            } catch (IOException e) {
                getLog().error(e);
            }
        }
    }

    private List<Map<String, String>> generateVariables(final CSVParser csvParser) throws IOException
    {
        List<Map<String, String>> variables = new ArrayList<>();
        Map<String, Integer> variableNames = new HashMap<>();
        int index = 1;
        for (CSVRecord record : csvParser.getRecords()) {
            Map<String, String> variable = new HashMap<>();
            switch (record.get("Type")) {
                case "Char":
                case "Char/Date":
                    variable.put("type", "String");
                    variable.put("format", "");
                    variable.put("length", record.get("Length"));
                    variable.put("converter", "");
                    variable.put("initValue", "");
                    if (generateFieldName(record.get("Field")).contains("DateTime")) {
                        variable.put("type", "Date");
                        variable.put("format", '"' + "yyyy-MM-dd-HH.mm.ss" +  '"');
                    } else if (generateFieldName(record.get("Field")).contains("ShipDate")) {
                        variable.put("type", "Date");
                        String shipDateFormat = "6".equals(record.get("Length")) ? "yyMMdd" : "yyyyMMdd";
                        variable.put("format", '"' + shipDateFormat +  '"');
                    } else if (record.get("Field").contains("Blank")) {
                        variable.put("initValue", " = \"\"");
                    } else if (record.get("Field").contains("Record Identifier")) {
                        variable.put("initValue", " = \"TRAILER\"");
                    }

                    variable.put("align", "");
                    break;
                case "Numeric":
                case "Decimal":
                    variable.put("type", "BigDecimal");
                    variable.put("format", generateFormatForNumeric(record.get("Length")));
                    variable.put("length", generateLengthForNumeric(record.get("Length").replaceFirst("(.*?)\\..*", "$1")));
                    variable.put("converter", 
                            ", converterType = BigDecimalConverter.class");
                    variable.put("initValue", "");
                    variable.put("align", "");
                    break;
                case "Sp Num":
                    variable.put("type", "String");
                    variable.put("format", "");
                    variable.put("length", record.get("Length"));
                    variable.put("converter", "");
                    variable.put("initValue", "");
                    variable.put("align", ", align = Align.LEFT");
                    break;
                default:
                    variable.put("type", record.get("Type"));
            }
            variable.put("pos", "" + index); // record.get("Pos")
            variable.put("required", "Yes".equalsIgnoreCase(record.get("Req")) ? ", required = true" : "");
            String generatedName = generateFieldName(record.get("Field"));
            if (variableNames.containsKey(generatedName)) {
                variableNames.put(generatedName, variableNames.get(generatedName) + 1);
                variable.put("field", generatedName + variableNames.get(generatedName));
            } else {
                variableNames.put(generatedName, 1);
                variable.put("field", generatedName);
            }
            variables.add(variable);
            index += 1;
        }
        return variables;
    }

    private String generateFormatForNumeric(String length)
    {
        if (length.contains(",")) {
            return '"' + length.replace(",", ".") + '"';
        }
        return '"' + length + ".0" + '"';
    }

    private String generateLengthForNumeric(String length)
    {
        Matcher matcher = TWO_NUMBERS.matcher(length);
        if (matcher.find()) {
            return "" + (Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(2)));
        }
        return length;
    }

    private String generateFieldName(String field)
    {
        return field.replaceAll("[^a-zA-Z0-9]", "");
    }

    private Template getTemplate(final String templatePath)
    {
        if (!Velocity.resourceExists(templatePath)) {
            StringResourceRepository repo = StringResourceLoader.getRepository();
            repo.putStringResource(templatePath, getTemplateFromResource(templatePath));
        }
        return Velocity.getTemplate(templatePath);
    }

    private String getTemplateFromResource(final String templatePath)
    {
        try {
            InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(templatePath);
            return IOUtils.toString(stream, "UTF-8");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
