package es.david.strings;

import org.apache.commons.lang3.StringUtils;

public class MyUtilsStrings 
{
	
	public static String borrarUltimo(String cadena)
	{
		return StringUtils.chop(cadena);
	}
}
