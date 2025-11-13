package com.krakedev.servicios;

import java.util.ArrayList;
import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;

	// CONSTRUCTOR
	public Juego(ArrayList<String> id) {
		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();

		for (int i = 0; i < id.size(); i++) {
			ArrayList<Carta> mano = new ArrayList<Carta>();
			cartasJugadores.add(mano);
		}
	}

	// MÉTODOS
	public void entregarCartas(int cartasPorJugador) {
		int totalJugadores = cartasJugadores.size();
		int indiceNaipe = 0;

		if (totalJugadores == 0) {
			System.out.println("No hay jugadores.");
			return;
		}

		for (int i = 0; i < cartasPorJugador; i++) {
			for (int j = 0; j < totalJugadores; j++) {
				if (indiceNaipe < naipeBarajado.size()) {
					Carta cartaActual = naipeBarajado.get(indiceNaipe);
					cartasJugadores.get(j).add(cartaActual);
					indiceNaipe++;
				}
			}
		}
	}

	public double devolverTotal(int id) {
		double resultado = 0;

		if (id >= 0 && id < cartasJugadores.size()) {
			ArrayList<Carta> mano = cartasJugadores.get(id);
			for (Carta cartaActual : mano) {
				resultado += cartaActual.getNumero().getValor();
			}
		}

		return resultado;
	}

	public String determinarGanador() {
		String idGanador = "";
		double sumaGanador = 0;

		for (int i = 0; i < cartasJugadores.size(); i++) {
			double totalJugador = devolverTotal(i);
			if (i == 0 || totalJugador > sumaGanador) {
				sumaGanador = totalJugador;
				idGanador = "Jugador " + (i + 1);
			}
		}

		return idGanador;
	}

	// GETTERS
	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}
}
