package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		String valor = numero + "";
		if(numero >= 0 && numero <=9) {
			valor = "0" + numero;
		}
		return valor;
	}
	
	public static String formatearDia(int numero) {
		String resultado = "";
		if(numero == 0) {
			resultado = "Lunes";
		} else if(numero == 1) {
			resultado = "Martes";
		} else if(numero == 2) {
			resultado = "Miercoles";
		} else if(numero == 3) {
			resultado = "Jueves";
		} else if(numero == 4) {
			resultado = "Viernes";
		} else if(numero == 5) {
			resultado = "Sabado";
		} else if(numero == 6) {
			resultado = "Domingo";
		}
		return resultado;
	}
	
}
