package com.krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;
	
	
	
	public Nota(Materia materia, double calificacion) {

		this.materia = materia;
		this.calificacion = calificacion;
	}

	//METODOS
	public void mostrar() {
		Materia m = getMateria();
		System.out.println("Datos: ");
		System.out.println("Nombre: " + m.getNombre() + " | Nota: " + calificacion);
	}
	
	//GETTERS Y SETTERS
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
}
