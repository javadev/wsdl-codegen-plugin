package $package;

import java.math.BigDecimal;
import java.util.Date;

import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;
import org.jsefa.flr.lowlevel.Align;
import org.jsefa.Serializer;
import org.jsefa.csv.CsvIOFactory;
import org.jsefa.csv.config.CsvConfiguration;

import net.hellmann.ecom.thirdparty.katespade.report.model.BigDecimalConverter;

@CsvDataType
public class $classname
{
#foreach ($variable in $variables)
	@CsvField(pos = $variable.get("pos"), format = {$variable.get("format")}$variable.get("converter")$variable.get("required")$variable.get("align"))
	private $variable.get("type") $variable.get("field")$variable.get("initValue");

#end
#foreach ($variable in $variables)
	public $variable.get("type") get$variable.get("field")()
	{
		return $variable.get("field");
	}

	public $classname set$variable.get("field")($variable.get("type") $variable.get("field"))
	{
		this.$variable.get("field") = $variable.get("field");
		return this;
	}

#end
	public static Serializer createSerializer()
	{
                CsvConfiguration config = new CsvConfiguration();
                config.setFieldDelimiter('|');
                return CsvIOFactory.createFactory(config, ${classname}.class).createSerializer();	
	}
}
