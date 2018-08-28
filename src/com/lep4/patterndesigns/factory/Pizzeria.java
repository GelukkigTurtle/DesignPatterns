package com.lep4.patterndesigns.factory;

public  class Pizzeria {
	
	PizzaFactory factory;
	
	public Pizzeria(PizzaFactory factory) {
		super();
		this.factory = factory;
	}

	public Pizza ordenarPizza(String tipo) {		
        Pizza pizza = factory.createPizza(tipo);
        
        if(pizza != null) { //Pizza existe!
			pizza.preparar();
			pizza.hornear();
			pizza.cortar();
			pizza.encajar();
        }else {
        	//Pizza no encontrada
        	System.out.println("La Pizza de "+tipo+" no existe!");
        }
	
		return pizza;
	}
	

}
