package com.krakedev.entidades;

import java.util.ArrayList;

import com.krakedev.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores;

	//METODOS
	public void jugar() {
		ArrayList<String> listaJugadores = new ArrayList<String>();
	    listaJugadores.add("Jugador 1");
	    listaJugadores.add("Jugador 2");
	    listaJugadores.add("Jugador 3");
	    
	    Juego juego = new Juego(listaJugadores);
	    juego.entregarCartas(5);
	    
	    ArrayList<ArrayList<Carta>> cartasJugadores = juego.getCartasJugadores();
	    for (int i = 0; i < listaJugadores.size(); i++) {
	    	
	        String jugadorActual = listaJugadores.get(i);
	        
	        ArrayList<Carta> manoJugador = cartasJugadores.get(i);
	        
	        int totalCartas = manoJugador.size();
	        
	        System.out.println(jugadorActual + " tiene " + totalCartas + " cartas.");
	    }

        
        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
	}
	
	//GETTERS Y SETTERS
	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
}
