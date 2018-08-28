package com.lep4.patterndesigns.factory;

public class PizzeriaMala {

	public static void main(String[] args) {
		
		//Cliente 1
		Pizza pizzaC1 = ordernarPizza("artesanal","peperoni");
		System.out.println("Cliente 1 recibe -> "+pizzaC1.getNombre());
		
		//Cliente 2
		Pizza pizzaC2 = ordernarPizza("premium","peperoni");
		pizzaC2.getNombre();
		System.out.println("Cliente 2 recibe -> "+pizzaC2.getNombre());


	}
	
	
	private static Pizza ordernarPizza(String menu,String tipo) {
		
		Pizza pizza = null;
		
		if(tipo.equals("peperoni")) {
			pizza = new PizzaPeperoniPremium();
		}else if(tipo.equals("margarita")) {
		    pizza = new PizzaMargarita();
		}
		
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.encajar();
		
		return pizza;
	}

}
