package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	//CONSTRUCTOR
	public Producto(String codigo, String nombre , double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	//METODOS
	public void incrementarPrecio(int incremento) {
		double inc = incremento / 100.0;
		this.precio = this.precio + (this.precio * inc);
	}
	
	public void disminuirPrecio(double descuento) {
		this.precio = this.precio - descuento;
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
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
