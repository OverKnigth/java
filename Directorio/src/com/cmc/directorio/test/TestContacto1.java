package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono(20, "Movi", "098234234");
		Contacto c = new Contacto("Juan", "Perez", telef, 40.5);
		
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Operadora: " + telef.getOperadora());
		System.out.println("Numero de telefono: " + telef.getNumero());
	}
}
