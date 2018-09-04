package com.lep4.patterndesigns.facade;

public class TeatroEnCasaFacade {
	Amplificador amp;
	Radio radio;
	DvdPlayer dvd;
	Proyector projector;
 
	
 
	public TeatroEnCasaFacade(Amplificador amp, Radio radio, DvdPlayer dvd, Proyector projector) {
		super();
		this.amp = amp;
		this.radio = radio;
		this.dvd = dvd;
		this.projector = projector;
	}


	public void mirarPelicula(String pelicula) {
		System.out.println("Listo para ver una pelicula ... ");
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(pelicula);
	}
 
 
	public void apagarPelicula() {
		System.out.println("Apagando el teatro en casa ...");
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

	public void escucharLaRadio(double frequency) {
		System.out.println("Sintonizando las emisoras ...");
		radio.on();
		radio.setfrecuencia(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setRadio(radio);
	}

	public void apagarLaRadio() {
		System.out.println("Apagando la radio...");
		radio.off();
		amp.off();
	}
}
