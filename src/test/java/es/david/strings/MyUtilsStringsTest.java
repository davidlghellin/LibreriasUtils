package es.david.strings;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class MyUtilsStringsTest 
{

	@Test
	public void borrarUltimo()
	{
		String cadenaInicial = "Esto es la cadena inicial0";
		String cadenaFinal = "Esto es la cadena inicial";
		
		cadenaInicial = StringUtils.chop(cadenaInicial);
		
		assertEquals(cadenaInicial,cadenaFinal);
	}
	
}
