package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	// METODOS
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		String mensaje = null;
		Estudiante estudianteE;
		String cedula = estudiante.getCedula();
		for (int i = 0; i < estudiantes.size(); i++) {
			estudianteE = estudiantes.get(i);
			if (cedula.equals(estudianteE.getCedula())) {
				mensaje = "El estudiante ya esta matriculado.";
			}
		}
		return mensaje;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		String r1 = buscarEstudiantePorCedula(estudiante);
		if (r1 == null) {
			estudiantes.add(estudiante);
			System.out.println("Estudiante matriculado con exito.");
		} else {
			System.out.println(r1);
		}

	}

	public double calcularPromedioCurso() {
		double resultado = 0;
		double suma = 0;
		Estudiante estudianteE;
		for (int i = 0; i < estudiantes.size(); i++) {
			estudianteE = estudiantes.get(i);
			suma += estudianteE.calcularPromedioNotasEstudiante();
			resultado = suma / (i + 1);
		}
		return resultado;
	}

	public void mostrar() {
		Estudiante estudianteE;
		for (int i = 0; i < estudiantes.size(); i++) {
			estudianteE = estudiantes.get(i);
			estudianteE.mostrar();
		}
		System.out.println("----------------------------------------------");
		System.out.println("Promedio del curso: " + calcularPromedioCurso());
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
