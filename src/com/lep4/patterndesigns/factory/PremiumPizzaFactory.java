package com.lep4.patterndesigns.factory;

public class PremiumPizzaFactory  extends PizzaFactory{
	
	
	public Pizza createPizza(String tipo) {
		Pizza pizza = null;

		if(tipo.equals("carne")) {
			pizza =  new PizzaCarne();
		}else if(tipo.equals("camaron")) {
			pizza = new PizzaCamaron();
		} 
		return pizza;
		
	}


}
