package com.lep4.patterndesigns.facade;

public class DvdPlayer {
	String description;
	int currentTrack;
	Amplificador amplificador;
	String pelicula;
	
	public DvdPlayer(String description, Amplificador amplificador) {
		this.description = description;
		this.amplificador = amplificador;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

        public void eject() {
		pelicula = null;
                System.out.println(description + " eject");
        }
 
	public void play(String pelicula) {
		this.pelicula = pelicula;
		currentTrack = 0;
		System.out.println(description + " reproduciendo \"" + pelicula + "\"");
	}

	public void play(int track) {
		if (pelicula == null) {
			System.out.println(description + " no se puede reproducirel track  " + track + " el dvd no ha sido insertado");
		} else {
			currentTrack = track;
			System.out.println(description + " reproduciendo track " + currentTrack + " de \"" + pelicula + "\"");
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + " stopped \"" + pelicula + "\"");
	}
 
	public void pause() {
		System.out.println(description + " paused \"" + pelicula + "\"");
	}

	public void configurarTwoChannelAudio() {
		System.out.println(description + " configurar 2 canales de audio");
	}
 
	public void configurarSurroundAudio() {
		System.out.println(description + " configurar surround audio");
	}
 
	public String toString() {
		return description;
	}
}
