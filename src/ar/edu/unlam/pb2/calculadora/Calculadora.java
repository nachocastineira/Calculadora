package ar.edu.unlam.pb2.calculadora;

public class Calculadora {
	
	
	public Double dividirNumeros (Double divisor, Double numerador) throws Exception 
	{
		Double numerador1 = numerador;
		Double divisor1 = divisor;
	
		
		//CON ESTO LANZO UNA EXCEPCION, en el if va el metodo que quiero realizar, si no puede voy al else y lanzo la excepcion
	if (numerador!=0) {
		return divisor1/numerador1;
	}
	
	else {
		throw new Exception("No se admite");
	}	
	}
}
