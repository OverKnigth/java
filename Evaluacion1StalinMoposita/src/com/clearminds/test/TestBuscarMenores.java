package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		Producto producto2 = new Producto("D456", "Doritos", 0.50);
		maquina.cargarProducto(producto2, "A1", 6);

		Producto producto3 = new Producto("D456", "Jet", 0.25);
		maquina.cargarProducto(producto3, "A2", 6);

		Producto producto4 = new Producto("D456", "De todito", 0.60);
		maquina.cargarProducto(producto4, "B2", 6);

		Producto producto5 = new Producto("D456", "CocaCola", 1.10);
		maquina.cargarProducto(producto5, "C1", 6);

		Producto producto6 = new Producto("D456", "Cerveza", 3.50);
		maquina.cargarProducto(producto6, "C2", 6);

		maquina.mostrarProductos();

		ArrayList<Producto> productos = new ArrayList<Producto>();
		System.out.println("--------------");
		productos = maquina.buscarMenores(1);

		System.out.println("Productos Menores: " + productos.size());
		for (int i = 0; i < productos.size(); i++) {
			Producto p = productos.get(i);
			System.out.println("Nombre:" + p.getNombre() + " Precio: " + p.getPrecio());
		}

	}
}
