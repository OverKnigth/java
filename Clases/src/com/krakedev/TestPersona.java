package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// Declaro la variable p de tipo Persona
		// Instanciar la clase y referenciar con la variable p
		Persona p = new Persona(16);
		Persona p2 = new Persona(16);
		// Asignar un valor al objeto
		p.setNombre("Juan");
		
		p2.setNombre("Stalin");
		p2.setEdad(21);
		// Visualizar los valores
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Nombre 2: " + p2.getNombre());
		System.out.println("Edad 2: " + p2.getEdad());
	}
}
