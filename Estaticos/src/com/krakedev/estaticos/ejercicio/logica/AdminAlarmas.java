package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas;
	
	//CONSTRUCTOR
	public AdminAlarmas() {
		alarmas = new ArrayList<Alarma>();
	}
	
	//METODOS
	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}

	//GETTERS
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	
}
