package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	// CONSTRUCTOR
	public Naipe() {
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
		for (int i = 0; i < numerosPosibles.size(); i++) {
			Numero num = numerosPosibles.get(i);
			cartas.add(new Carta(num, "CR"));
			cartas.add(new Carta(num, "CN"));
			cartas.add(new Carta(num, "DI"));
			cartas.add(new Carta(num, "TR"));
		}
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		Carta cartaE;
		for (int i = 0; i < 100; i++) {
			int posicion = Random.obtenerPosicion();
			cartaE = cartas.get(posicion);
			if(cartaE.getEstado().equals("N")) {
				auxiliar.add(cartaE);
				cartaE.setEstado("C");
			}
		}
		for (int i = 0; i < cartas.size(); i++) {
	        cartaE = cartas.get(i);
	        if (cartaE.getEstado().equals("N")) {
	            auxiliar.add(cartaE);
	            cartaE.setEstado("C");
	        }
	    }
		
		return auxiliar;
	}

	// GETTERS Y SETTERS
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

}
