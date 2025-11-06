package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante es = new Estudiante("Juan");
		
		es.calificar(8);
		
		System.out.println("DATOS");
		System.out.println("Nombre: " + es.getNombre());
		System.out.println("Nota: " + es.getNota());
		System.out.println("Resultado: " + es.getResultado());
	}
}
