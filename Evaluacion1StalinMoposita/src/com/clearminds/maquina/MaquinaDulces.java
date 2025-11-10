package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	//CONSTRUCTOR
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	
	//METODOS
	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}
	
	public void mostrarConfiguracion() {
		Celda celdaE;
		for(int i=0; i < celdas.size(); i++) {
			celdaE = celdas.get(i);
			System.out.println("Celda "+ (i + 1) + ": " + celdaE.getCodigo());
		}
	}
	
	public Celda buscarCelda(String codigo) {
		Celda celdaE = null;
		Celda elementoC;
		for(int i=0; i < celdas.size(); i++) {
			elementoC = celdas.get(i);
			if(codigo.equals(elementoC.getCodigo())) {
				celdaE = elementoC;
			}
		}
		return celdaE;
	}
	
	public void cargarProducto(Producto producto, String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, items);
	}
	
	public void mostrarProductos() {
		Celda celdaE;
		Producto p;
		for(int i=0; i < celdas.size(); i++) {
			celdaE = celdas.get(i);
			p = celdaE.getProducto();
			System.out.println("-----------");
			System.out.println("Codigo: " + celdaE.getCodigo());
			if(p != null) {
				System.out.println("Nombre: " + p.getNombre());
				System.out.println("Precio: " + p.getPrecio());
			} else {
				System.out.println("Esta celda no tiene un producto.");
			}
			System.out.println("Stock: " + celdaE.getStock());
		}
		System.out.println("-----------");
		System.out.println("Saldo: " + saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Producto productoE = null;
		Celda celdaE;
		for(int i=0; i < celdas.size(); i++) {
			celdaE = celdas.get(i);
			if(codigo.equals(celdaE.getCodigo())) {
				productoE = celdaE.getProducto();
			}
		}
		return productoE;
	}
	
	public double consultarPrecio(String codigo) {
		double resultado = 0;
		Celda celdaE;
		Producto productoE;
		for(int i=0; i < celdas.size(); i++) {
			celdaE = celdas.get(i);
			if(codigo.equals(celdaE.getCodigo())) {
				productoE = celdaE.getProducto();
				resultado = productoE.getPrecio();
			}
		}
		return resultado;
	}
	
	public Celda buscarCeldaProducto(String codigo) {
		Celda celdaR = null;
		Producto p;
		Celda celdaE;
		for(int i=0; i < celdas.size(); i++) {
			celdaE = celdas.get(i);
			p = celdaE.getProducto();
			if(celdaE.getProducto() != null && codigo.equals(p.getCodigo())) {
				celdaR = celdaE;
			}
		}
		return celdaR;
	}
	
	public void incrementarProductos(String codigo, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int stock = celdaEncontrada.getStock() + items;
		celdaEncontrada.setStock(stock);
		
	}
	
	public void vender(String codigo) {
		Celda celdaE;
		Producto p;
		for(int i=0; i < celdas.size(); i++) {
			celdaE = celdas.get(i);
			if(codigo.equals(celdaE.getCodigo())) {
				p = celdaE.getProducto();
				int stock = celdaE.getStock() - 1;
				celdaE.setStock(stock);
				double precio = p.getPrecio();
				this.saldo = saldo + precio;
			}
		}
	}
	
	public double venderConCambio(String codigo, double cambio) {
		double resultado = 0;
		Celda celdaE;
		Producto p;
		for(int i=0; i < celdas.size(); i++) {
			celdaE = celdas.get(i);
			if(codigo.equals(celdaE.getCodigo())) {
				p = celdaE.getProducto();
				int stock = celdaE.getStock() - 1;
				celdaE.setStock(stock);
				double precio = p.getPrecio();
				this.saldo = saldo + precio;
				resultado = cambio - this.saldo;
			}
		}
		return resultado;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Celda celdaE;
		Producto p;
		for(int i=0; i < celdas.size(); i++) {
			celdaE = celdas.get(i);
			p = celdaE.getProducto();
			if(celdaE.getProducto() != null && p.getPrecio() <= limite) {
				menores.add(p);
			}
		}
		return menores;
	}

	//GETTERS Y SETTERS
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
