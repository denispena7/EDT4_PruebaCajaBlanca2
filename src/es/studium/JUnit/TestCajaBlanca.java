package es.studium.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca {

	@Test
	void camino1() 
	{
		String resultadoReal = CajaBlanca.esVocal("Hola");
		String resultadoEsperado = "No has introducido un �nico car�cter.";
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void camino2() 
	{
		String resultadoReal = CajaBlanca.esVocal("1");
		String resultadoEsperado = "El car�cter no es una letra.";
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino3() 
	{
		String resultadoReal = CajaBlanca.esVocal("a");
		String resultadoEsperado = "El car�cter es una vocal.";
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino4() 
	{
		String resultadoReal = CajaBlanca.esVocal("y");
		String resultadoEsperado = "El car�cter a veces es una vocal y a veces es una consonante.";
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino5() 
	{
		String resultadoReal = CajaBlanca.esVocal("b");
		String resultadoEsperado = "El car�cter es una consonante.";
		assertEquals(resultadoEsperado, resultadoReal);
	}
}