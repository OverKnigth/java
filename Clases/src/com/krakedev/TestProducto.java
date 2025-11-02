package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "Paracetamol";
		productoB.nombre = "Loratadina";
		productoC.nombre = "Alcohol";
		
		productoA.descripcion = "Ayuda a aliviar cualquier dolor.";
		productoB.descripcion = "Ayuda a aliviar las alergias.";
		productoC.descripcion = "Ayuda a limpiar heridas.";
		
		productoA.precio = 0.50;
		productoB.precio = 0.35;
		productoC.precio = 1;
		
		productoA.stockActual = 25;
		productoB.stockActual = 15;
		productoC.stockActual = 32;
		
		System.out.println("PRODUCTO 1");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock: " + productoA.stockActual);
		System.out.println("--------------------------------------");
		System.out.println("PRODUCTO 2");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock: " + productoB.stockActual);
		System.out.println("--------------------------------------");
		System.out.println("PRODUCTO 3");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock: " + productoC.stockActual);
	}
}
