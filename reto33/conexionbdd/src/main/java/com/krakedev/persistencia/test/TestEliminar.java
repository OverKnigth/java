package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {
	public static void main(String[] args) {
		try {
			// ELIMINAR EN LA BASE DE DATOS
			AdminPersonas.eliminar("1721870011");
		} catch (Exception e) {
			// MANEJAR LOS ERRORES
			System.out.println("ERROR EN EL SISTEMA: " + e.getMessage());
		}
	}
}
