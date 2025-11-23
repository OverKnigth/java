package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminProductos;

public class TestEliminarProducto {
	public static void main(String[] args) {
		try {
			// ELIMINAR EN LA BASE DE DATOS
			AdminProductos.eliminar(12);
		} catch (Exception e) {
			// MANEJAR LOS ERRORES
			System.out.println("ERROR EN EL SISTEMA: " + e.getMessage());
		}
	}
}
