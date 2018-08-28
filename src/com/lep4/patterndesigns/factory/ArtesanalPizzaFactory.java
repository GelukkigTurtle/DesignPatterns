package com.lep4.patterndesigns.factory;

public class ArtesanalPizzaFactory extends PizzaFactory{
	
	public Pizza createPizza(String tipo) {
		Pizza pizza = null;

		if(tipo.equals("peperoni")) {
			pizza =  new PizzaPeperoniArtesanal();
		}else if(tipo.equals("jamon")) {
			pizza = new PizzaJamon();
		} else if(tipo.equals("queso")) {
			pizza = new PizzaQueso();
		}else if (tipo.equals("margarita")) {
		   pizza = new PizzaMargarita();
		}
		
		return pizza;
		
	}

}
