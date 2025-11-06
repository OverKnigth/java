package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto("Camiseta", -20);
		double resultado = p1.calcularPrecioPromo(0.25);
		
		System.out.println("Nombre: " + p1.getNombre());
		System.out.println("Precio: " + p1.getPrecio());
		System.out.println("Precio Promo: " + resultado);
	}
}
