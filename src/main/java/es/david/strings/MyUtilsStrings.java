package es.david.strings;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class MyUtilsStrings
{
	private static Logger log = LoggerFactory.getLogger(MyUtilsStrings.class);

	public static String borrarUltimo(String cadena)
	{
		log.info("INI borrarUltimo");
		/*
		 * Con este metodo lo que hacemos es borrar el ultimo caracter
		 */
		return StringUtils.chop(cadena);
	}
}
