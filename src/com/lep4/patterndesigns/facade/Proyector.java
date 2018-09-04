package com.lep4.patterndesigns.facade;

public class Proyector {
	String description;
	DvdPlayer dvdPlayer;
	
	public Proyector(String description, DvdPlayer dvdPlayer) {
		this.description = description;
		this.dvdPlayer = dvdPlayer;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void wideScreenMode() {
		System.out.println(description + " en modo widescreen (16x9 aspect ratio)");
	}

	public void tvMode() {
		System.out.println(description + " en modo tv (4x3 aspect ratio)");
	}
  
        public String toString() {
                return description;
        }
}
