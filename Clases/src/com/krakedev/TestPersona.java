package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// Declaro la variable p de tipo Persona
		// Instanciar la clase y referenciar con la variable p
		Persona p = new Persona();
		Persona p2 = new Persona();
		// Asignar un valor al objeto
		p.nombre = "Juan";
		p.edad = 18;
		p2.nombre = "Stalin";
		p2.edad = 21;
		// Visualizar los valores
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Nombre 2: " + p2.nombre);
		System.out.println("Edad 2: " + p2.edad);
	}
}
