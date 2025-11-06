package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	//CONSTRUCTOR 
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		setPrecio(precio);
	}
	
	//METODOS
	public double calcularPrecioPromo(double descuento) {
		double resultado;
		resultado = precio - (precio * descuento);
		return resultado;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio < 0) {
		this.precio = precio * -1;
		} else {
			this.precio = precio;
		}
	}
	
	
}
