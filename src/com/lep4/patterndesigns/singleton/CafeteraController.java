package com.lep4.patterndesigns.singleton;

public class CafeteraController {
	
	public static void main(String args[]) {
		//Cafetera cafetera = Cafetera.getInstance();
		Cafetera cafetera  = Cafetera.getInstance();
		cafetera.verEstado("Instancia 1");

		cafetera.llenar();
		cafetera.hervir();
		
		cafetera.verEstado("Instancia 1");

			
		//cafetera.vaciar();

		//cafetera.verEstado("Instancia 1");

		// Retornara la misma instancia
		//Cafetera cafetera2 = Cafetera.getInstance();
		
		cafetera  =  Cafetera.getInstance(); // otro lado del codigo
		cafetera.verEstado("Instancia 2");
		
		cafetera.llenar();
		
		cafetera.verEstado("Instancia 2");


	}

}
