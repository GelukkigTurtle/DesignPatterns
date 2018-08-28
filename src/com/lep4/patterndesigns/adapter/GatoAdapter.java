package com.lep4.patterndesigns.adapter;

public class GatoAdapter implements Perro{
	
	Gato gato;

	public GatoAdapter(Gato gato) {
		super();
		this.gato = gato;
	}

	@Override
	public void ladrar() {
		gato.maullar();
		
	}

	@Override
	public void morder() {
		gato.rasgar();
		
	}

	@Override
	public void rascar() {
		// TODO Auto-generated method stub
		
	}

}
