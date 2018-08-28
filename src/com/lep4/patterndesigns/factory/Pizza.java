package com.lep4.patterndesigns.factory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String nombre;
	ArrayList <String> extras = new ArrayList<String>();
	
	
	void preparar(){
		System.out.println("Preparando "+ nombre);
		System.out.println("Colocando la masa ... ");
		System.out.println("Agregando la salsa ... ");
		System.out.println("Agregando los extras ... ");
		for(int i=0; i < extras.size(); i++) {
			System.out.println("	"+ extras.get(i));
		}
	}
	
	void hornear() {
		System.out.println("Hornear por 25 minutos a 350");
	}
	
	void cortar() {
		System.out.println("Cortando la pizza en pedazos diagonales");
	}
	
	void encajar() {
		System.out.println("Colocando la pizza en la caja oficial de la Pizzeria");

	}
	
	public String getNombre() {
		return nombre;
	}
	

}
