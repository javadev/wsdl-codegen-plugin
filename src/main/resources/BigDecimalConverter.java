package $package;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.jsefa.common.converter.SimpleTypeConverter;
import org.jsefa.common.converter.SimpleTypeConverterConfiguration;

public class BigDecimalConverter implements SimpleTypeConverter
{
	private static final DecimalFormatSymbols SYMBOLS = new DecimalFormatSymbols(new Locale("en"));
	private static final Map<String, DecimalFormat> FORMATS = createFormatMap();
	private DecimalFormat format;

	private static Map<String, DecimalFormat> createFormatMap()
	{
		Map<String, DecimalFormat> formats = new HashMap<>();
		formats.put("15.0", new DecimalFormat("000000000000000", SYMBOLS));
		formats.put("15.2", new DecimalFormat("0000000000000.00", SYMBOLS));
		formats.put("15.5", new DecimalFormat("0000000000.00000", SYMBOLS));
		formats.put("10.8", new DecimalFormat("00.00000000", SYMBOLS));
		formats.put("7.0", new DecimalFormat("0000000", SYMBOLS));
		formats.put("9.0", new DecimalFormat("000000000", SYMBOLS));
		formats.put("9.2", new DecimalFormat("0000000.00", SYMBOLS));
		return Collections.unmodifiableMap(formats);
	}

	public static BigDecimalConverter create(SimpleTypeConverterConfiguration configuration)
	{
		return new BigDecimalConverter(configuration);
	}

	public BigDecimalConverter(SimpleTypeConverterConfiguration configuration)
	{
		format = FORMATS.get(configuration.getFormat()[0]);
		if (format == null)
		{
			throw new IllegalArgumentException("unknown format: " + configuration.getFormat()[0]);
		}
	}

	@Override
	public String toString(Object value)
	{
		return format.format(value).replace(".", "");
	}

	@Override
	public Object fromString(String source)
	{
		throw new UnsupportedOperationException();
	}
}
