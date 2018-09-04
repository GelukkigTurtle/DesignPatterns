package com.lep4.patterndesigns.facade;

public class Radio {
	String description;
	Amplificador amplificador;
	double frecuencia;

	public Radio(String description, Amplificador amplificador) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void setfrecuencia(double frecuencia) {
		System.out.println(description + " configurando frecuencia a " + frecuencia);
		this.frecuencia = frecuencia;
	}

	public void setAm() {
		System.out.println(description + " configurando AM mode");
	}

	public void setFm() {
		System.out.println(description + " configurando FM mode");
	}

	public String toString() {
		return description;
	}
}
