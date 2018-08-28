package com.lep4.patterndesigns.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		System.out.println("Comportamiento perro husky");

	
		Perro perroHusky = new Husky();
		perroHusky.ladrar();
		
		Siames siames = new Siames();
		Persa persa = new Persa();
		Perro adapter = new GatoAdapter(persa);
		
		System.out.println("Comportamiento perro adapter");
		
		adapter.ladrar();
		adapter.morder();
		
		
		

	}

}
