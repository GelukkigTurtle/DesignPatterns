package com.lep4.patterndesigns.factory;

/**
 * @author freddy
 * Clase de ejmplo para demostrar como funciona
 * el patron FACTORY METHOD
 */
public class TestFactory {
	

	public static void main(String[] args) {
	 // Ir a la pizzeria
		
		Pizzeria local = null;
		
		//Cliente 1) Juan
	    local = new Pizzeria(new ArtesanalPizzaFactory());
	    local.ordenarPizza("peperoni");
	    //local.ordenarPizza("jamon");
	    local.ordenarPizza("camaron");

	    
	    //Cliente 2) Pedro
		local = new Pizzeria(new PremiumPizzaFactory());
		local.ordenarPizza("camaron");
	    local.ordenarPizza("ajo");

	}
	

}
