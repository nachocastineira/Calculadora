package ar.edu.unlam.pb2.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test  (expected = Exception.class)  //tengo que poner eso para que no caiga el programa, la relanza
	public void testCalculadoraTonta() throws Exception {  
		Calculadora calculadora = new Calculadora();
		assertEquals(0, calculadora.dividirNumeros(2d, 0d), 0);
	}
	
	@Test
	public void testConTryCatchFinally() {
		Calculadora calculadora2 = new Calculadora();
		
		try {
			assertEquals(0, calculadora2.dividirNumeros(2d, 0d), 0);  //Intenta ejecutar el metodo
			
		} catch (Exception e) {  //si no se ejecuta el metodo anterior, capturo y trato la excepcion
			System.out.println("No se puede realizar la operacion");
		}
	}	

}
