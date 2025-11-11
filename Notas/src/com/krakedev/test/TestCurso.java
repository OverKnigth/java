package com.krakedev.test;

import com.krakedev.entidades.Curso;
import com.krakedev.entidades.Estudiante;
import com.krakedev.entidades.Materia;
import com.krakedev.entidades.Nota;

public class TestCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		 Materia sociales= new Materia("COD1", "Sociales");
		 Materia matematicas= new Materia("COD2", "Matematicas");
		 Materia lenguaje= new Materia("COD3", "Lenguaje");

		 Estudiante estudiante = new Estudiante("1234567890", "Juan", "Perez");
		 Estudiante estudiante2 = new Estudiante("1234567829", "Pablo", "Perez");
	     Nota nota1 = new Nota(sociales, 8.0);
	     Nota nota2 = new Nota(matematicas, 10.0);
	     Nota nota3 = new Nota(lenguaje, 7.0);
	     
	     Nota nota11 = new Nota(sociales,6.5);
	     Nota nota12 = new Nota(matematicas, 4.0);
	     Nota nota13 = new Nota(lenguaje, 9.25);
	     
	     estudiante.agregarNota(nota1);
	     estudiante.agregarNota(nota2);
	     estudiante.agregarNota(nota3);

	     estudiante2.agregarNota(nota11);
	     estudiante2.agregarNota(nota12);
	     estudiante2.agregarNota(nota13);

	     System.out.println("---------------------------------------------");
	     curso1.matricularEstudiante(estudiante);
	     curso1.matricularEstudiante(estudiante2);
	     curso1.matricularEstudiante(estudiante2);
	     
	     System.out.println("---------------------------------------------");
	     System.out.println(curso1.getEstudiantes().size());
	     System.out.println(curso1.calcularPromedioCurso());

	     curso1.mostrar();

	}
}
