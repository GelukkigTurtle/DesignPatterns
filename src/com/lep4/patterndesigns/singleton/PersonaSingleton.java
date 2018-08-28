package com.lep4.patterndesigns.singleton;

public class PersonaSingleton {
	
	private String nombre;
	
	// variable que represanta la instancia
	private static PersonaSingleton personaSingleton;
	
	//constructor por defecto cambiado a private para que no 
	// accedan desde fuera
	private PersonaSingleton(String nombre) {
		this.nombre = nombre;
	}
	
	// metodo para obtener o creat la unica instancia
	public static PersonaSingleton getInstance(String nombre) {
		if(personaSingleton == null) { 
			// Esto solo sucede la primera vez
			personaSingleton = new PersonaSingleton(nombre);
		}else {
			System.out.println("Este objeto ya ha sido instanciado");
		}
		
		return personaSingleton;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
