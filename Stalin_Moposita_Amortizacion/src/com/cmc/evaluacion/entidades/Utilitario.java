package com.cmc.evaluacion.entidades;

public class Utilitario {
	public static double redondear(double num) {
		double resultado = 0;
		resultado = Math.round(num * 100.0) / 100.0;
		return resultado;
	}
}
