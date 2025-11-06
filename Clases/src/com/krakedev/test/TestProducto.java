package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("Paracetamol");
		productoB.setNombre("Loratadina");
		productoC.setNombre("Alcohol");
		
		productoA.setDescripcion("Ayuda a aliviar cualquier dolor.");
		productoB.setDescripcion("Ayuda a aliviar las alergias.");
		productoC.setDescripcion("Ayuda a limpiar heridas.");
		
		productoA.setPrecio(0.50);
		productoB.setPrecio(0.35);
		productoC.setPrecio(1);
		
		productoA.setStockActual(25);
		productoB.setStockActual(15);
		productoC.setStockActual(32);
		
		System.out.println("PRODUCTO 1");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock: " + productoA.getStockActual());
		System.out.println("-------------------------------------");
		System.out.println("PRODUCTO 2");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock: " + productoB.getStockActual());
		System.out.println("-------------------------------------");
		System.out.println("PRODUCTO 3");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock: " + productoC.getStockActual());
	}
}
