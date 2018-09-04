package com.lep4.patterndesigns.facade;

public class BadTestTeatroEnCasa {

	public static void main(String[] args) {
		//Configuracion de entidades
		Amplificador amp = new Amplificador("Amplificador Sony");
		DvdPlayer dvd = new DvdPlayer("DVD Sony", amp);
		Proyector proyector = new Proyector("Proyector EPSON", dvd);
		
		//Encender Proyector
		proyector.on();
		proyector.tvMode();
		//Encender amplificador
		amp.on();
		amp.setStereoSound();
		amp.setVolume(75);
		//Encender DVD
		dvd.on();
		dvd.eject();
		dvd.configurarSurroundAudio();
		dvd.play("Bastardos sin Gloria");
		
		dvd.stop();
		dvd.off();
		amp.off();
		proyector.off();
	}

}
