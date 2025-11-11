package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	// COSTRUCTOR
	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas = new ArrayList<Nota>();
	}

	// METODOS
	public void agregarNota(Nota nuevaNota) {
		Nota nota;
		Materia materia;
		double cal = nuevaNota.getCalificacion();
		Materia materiaN = nuevaNota.getMateria();

		if (cal > 10 || cal < 0) {
			System.out.println("Nota fuera del rango.");
			return;
		}

		for (int i = 0; i < notas.size(); i++) {
			nota = notas.get(i);
			materia = nota.getMateria();
			if (materiaN.getCodigo().equals(materia.getCodigo())) {
				System.out.println("Materia duplicada.");
				return;
			}
		}
		notas.add(nuevaNota);
		System.out.println("Nota Agregada");
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota nota;
		Materia materia;
		if (nuevaNota > 10 || nuevaNota < 0) {
			System.out.println("Nota fuera del rango.");
			return;
		}
		for (int i = 0; i < notas.size(); i++) {
			nota = notas.get(i);
			materia = nota.getMateria();
			if (codigo.equals(materia.getCodigo())) {
				nota.setCalificacion(nuevaNota);
				System.out.println("Nota modificada.");
				return;
			}
		}
		System.out.println("Codigo de Materia no encontrado, ingrese uno valido.");
	}

	public double calcularPromedioNotasEstudiante() {
		double resultado = 0;
		Nota nota;
		for (int i = 0; i < notas.size(); i++) {
			nota = notas.get(i);
			resultado += nota.getCalificacion();
		}
		return resultado/notas.size();
	}

	public void mostrar() {
		System.out.println("-------------------------------------------");
	    System.out.println("Estudiante: " + nombre + " " + apellido + " | Cédula: " + cedula);
	    System.out.println("Notas:");
	    
	    if (notas.size() == 0) {
	        System.out.println("No tiene notas registradas.");
	        System.out.println("Promedio: N/A");
	        return;
	    }
	    
	    for (int i = 0; i < notas.size(); i++) {
	        Nota notaE = notas.get(i);
	        Materia materiaE = notaE.getMateria();
	       
	        System.out.println("- " + materiaE.getNombre() + ": " + notaE.getCalificacion());
	    }
	    System.out.println("Promedio: " + calcularPromedioNotasEstudiante());
	}


	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
