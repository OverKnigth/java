package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.servicios.AdminProductos;

public class TestActualizarProducto {
	public static void main(String[] args) {
		Producto p = new Producto(11, "Whisky", new BigDecimal(23.50), 12);
		try {
			p.setDescripcion("Bebida Alcoholica");
			// ACTUALIZAR EN LA BASE DE DATOS
			AdminProductos.actualizar(p);
		} catch (Exception e) {
			// MANEJAR LOS ERRORES
			System.out.println("ERROR EN EL SISTEMA: " + e.getMessage());
		}
	}
}
