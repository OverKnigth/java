package com.krakedev;

public class Cuadrado {
	private int lado;
	
	//CONSTRUCTOR
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	//METODOS
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	//METODOS GETTERS Y SETTERS
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
}
