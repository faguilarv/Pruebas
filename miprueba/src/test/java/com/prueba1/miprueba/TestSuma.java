package com.prueba1.miprueba;

import junit.framework.TestCase;

public class TestSuma extends TestCase {
	
	public void testSumar() 
	{
		Suma suma = new Suma();
		double resultado = suma.sumar(1.0, 1.0);
		assertEquals(2.0, resultado);
	}
	public void testDuplicar() {
		Suma suma = new Suma();
		double resultado = suma.duplicar(2.0);
		assertEquals(4.0, resultado);
		
	}

}
