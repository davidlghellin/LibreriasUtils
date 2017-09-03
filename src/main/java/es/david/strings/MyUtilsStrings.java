package es.david.strings;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class MyUtilsStrings
{
	//https://commons.apache.org/proper/commons-lang/javadocs/api-3.1/org/apache/commons/lang3/StringUtils.html
	private static Logger log = LoggerFactory.getLogger(MyUtilsStrings.class);

	public static String borrarUltimo(String cadena)
	{
		log.info("INI borrarUltimo");
		/*
		 * Con este metodo lo que hacemos es borrar el ultimo caracter
		 */
		return StringUtils.chop(cadena);
	}
	
	public static boolean isVacioOrNull(String cadena)
	{
		return StringUtils.isEmpty(cadena);
	}
	
	public static boolean isVacioOrNullOrEspacio(String cadena)
	{
		return StringUtils.isBlank(cadena);
	}
	
	public static String eliminarEspaciosPrimeros(String cadena)
	{
		//nota no borra todos, solo los del principio
		//trim = strip
		return StringUtils.trim(cadena);
	}
	
	public static boolean iguales(String cadena1,String cadena2)
	{
		return StringUtils.equals(cadena1,cadena2);
	}
}
