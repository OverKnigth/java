package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.servicios.AdminProductos;

public class TestAdminProductos {
	public static void main(String[] args) {
		//INSERCION
		Producto p = new Producto(12, "Cloro", new BigDecimal(0.75), 100);
		try {
			// INSERTAR EN LA BASE DE DATOS
			AdminProductos.insertar(p);
		} catch (Exception e) {
			// MANEJAR LOS ERRORES
			System.out.println("ERROR EN EL SISTEMA: " + e.getMessage());
		}
	}
}
