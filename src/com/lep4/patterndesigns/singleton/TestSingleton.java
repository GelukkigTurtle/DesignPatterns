package com.lep4.patterndesigns.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		PersonaSingleton persona1 = PersonaSingleton.getInstance("juan");
		PersonaSingleton persona2 = PersonaSingleton.getInstance("pedro");

		System.out.println("persona 1) "+  persona1.getNombre());
		System.out.println("persona 2) "+  persona2.getNombre());
	}

}
