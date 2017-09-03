package es.david.strings;

import static org.junit.Assert.assertEquals;

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

		cadenaInicial = MyUtilsStrings.borrarUltimo(cadenaInicial);

		assertEquals(cadenaInicial, cadenaFinal);
	}

	@Test
	public void isVacioOrNull()
	{
		assertEquals(true, MyUtilsStrings.isVacioOrNull(""));
		assertEquals(true, MyUtilsStrings.isVacioOrNull(null));
		assertEquals(false, MyUtilsStrings.isVacioOrNull("XX"));
	}

	@Test
	public void isVacioOrNullOrEspacio()
	{
		assertEquals(true, MyUtilsStrings.isVacioOrNullOrEspacio(""));
		assertEquals(true, MyUtilsStrings.isVacioOrNullOrEspacio("   "));
		assertEquals(true, MyUtilsStrings.isVacioOrNullOrEspacio(null));
		assertEquals(false, MyUtilsStrings.isVacioOrNullOrEspacio("XX"));
	}

	@Test
	public void eliminarEspaciosPrimeros()
	{
		String cadenaInicial = "    abc    ";
		String cadenaFinal = "abc";

		assertEquals(cadenaFinal, MyUtilsStrings.eliminarEspaciosPrimeros(cadenaInicial));
		assertEquals(null, MyUtilsStrings.eliminarEspaciosPrimeros(null));
	}

	@Test
	public void iguales()
	{
		String cadena1 = "abc";
		String cadena2 = "abc";

		assertEquals(true, MyUtilsStrings.iguales(cadena1, cadena2));
		assertEquals(true, MyUtilsStrings.iguales(null, null));
		assertEquals(false, MyUtilsStrings.iguales(cadena1, cadena2 + " "));
	}

}
