package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.servicios.AdminProductos;

public class TestConsultarProductos {
	public static void main(String[] args) {
		try {
			Producto p = AdminProductos.buscarPorCodigo(2);
			System.out.println(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
