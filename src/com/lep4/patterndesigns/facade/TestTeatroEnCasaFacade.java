package com.lep4.patterndesigns.facade;

public class TestTeatroEnCasaFacade {
	public static void main(String[] args) {

		Amplificador amp = new Amplificador("Amplificador Sony");
		Radio radio = new Radio("Radio AM/FM Sony", amp);
		DvdPlayer dvd = new DvdPlayer("DVD Player Sony", amp);
		Proyector proyector = new Proyector("Proyector Sony", dvd);
		
		TeatroEnCasaFacade fachada = new TeatroEnCasaFacade(amp, radio, dvd, proyector);
		
		//fachada.mirarPelicula("Regreso al Futuro");
		//fachada.apagarPelicula();
		fachada.escucharLaRadio(100.1);
		fachada.apagarLaRadio();
	}
}
