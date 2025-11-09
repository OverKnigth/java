package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		// El NullPointerException ocurre porque en esta línea se intenta acceder al nombre del producto
		// cuando el producto no esta ni siquiera definido y asignado al objeto, lo que hace que getProducto() 
		// devuelva null, generando un null.getNombre(), provocando el error.
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}
