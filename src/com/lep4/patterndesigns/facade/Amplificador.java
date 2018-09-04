package com.lep4.patterndesigns.facade;

public class Amplificador {
	
	String description;
	Radio tuner;
	DvdPlayer dvd;
	
	public Amplificador(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void setStereoSound() {
		System.out.println(description + " stereo mode on");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " surround sound encendido (5 parlantes, 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " configurando volume a " + level);
	}

	public void setRadio(Radio tuner) {
		System.out.println(description + " configurando radio a " + dvd);
		this.tuner = tuner;
	}
  
	public void setDvd(DvdPlayer dvd) {
		System.out.println(description + " configurando DVD player a " + dvd);
		this.dvd = dvd;
	}

 
	public String toString() {
		return description;
	}

}
