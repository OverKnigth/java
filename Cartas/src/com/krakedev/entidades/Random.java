package com.krakedev.entidades;

public class Random {
	public static int obtenerPosicion() {
		int numero = (int) (Math.random() * 52);
        return numero; 
	}
}
