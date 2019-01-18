package com.github.javadev.wsdlcodegenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.StringUtils;

/**
 * @goal csv2flr
 * @phase generate-sources
 * @description generate the java source code
 */
public class Csv2flr extends AbstractMojo {

    /**
     * @parameter property="project"
     * @required
     */
    private MavenProject project;

    /**
     * @parameter property="csvFiles"
     * @required
     */
    private String csvFiles;

    /**
     * @parameter property="outPackage"
     * @required
     */
    private String outPackage;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("csv files:" + csvFiles);
        getLog().info("out package:" + outPackage);
        if (csvFiles == null) {
            throw new MojoExecutionException("csvFiles is empty");
        }
        if (outPackage == null) {
            throw new MojoExecutionException("outPackage is empty");
        }

        String[] cmdArgs = csvFiles.split(",");
        List<String> fileLocations = new ArrayList<>();
        for (String file : cmdArgs) {
            fileLocations.add(StringUtils.strip(file));
        }
        getLog().info(outPackage + " generated.");
        new FlrGenerator(project.getBasedir().getAbsolutePath(), fileLocations, outPackage).generate();

        project.addCompileSourceRoot(new File(project.getBuild().getDirectory() + "/generated-sources/flrmodels/").getAbsolutePath());
    }
}
