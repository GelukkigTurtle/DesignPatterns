package com.lep4.patterndesigns.singleton;

public class Cafetera {
	
	private boolean vacia;
	private boolean hirviendo;
	private static Cafetera instanciaUnica;
	
	
	private Cafetera() {
		vacia = true;
		hirviendo = false;
	}
  
	public static Cafetera getInstance() {
		if (instanciaUnica == null) {
			System.out.println("Creando una instancia unica de la cafetera");
			instanciaUnica = new Cafetera();
		}
		System.out.println("Retornando la instancia de la cafetera");
		return instanciaUnica;
	}

	public void llenar() {
		if (isVacia()) {
			vacia = false;
			hirviendo = false;
			// llenamos la cafetera con un mix de lecha y chocolate
		}
	}
 
	public void vaciar() {
		if (!isVacia() && isHirviendo()) {
			// drenamos la caftera con leche y chocolate hirviendo
			vacia = true;
			hirviendo = false;
		}
	}
 
	public void hervir() {
		if (!isVacia() && !isHirviendo()) {
			// hervimos el contendio de la cafetera
			hirviendo = true;
		}
	}
  
	public boolean isVacia() {
		return vacia;
	}
 
	public boolean isHirviendo() {
		return hirviendo;
	}
	
	public void verEstado(String cafetera) {
		System.out.println("** "+ cafetera +" **");
		System.out.println("Vacia = "+vacia);
		System.out.println("Hirviendo = "+hirviendo);

	}

}
