package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono(20, "Movi", "098234234");
		Telefono telef2 = new Telefono(25, "Movi", "098234235");
		Contacto c = new Contacto("Juan", "Perez", telef, 57.5);
		Contacto c2 = new Contacto("Pedro", "Perez", telef2, 55.5);
		AdminContactos ac = new AdminContactos();
		
		Contacto r1 = ac.buscarMasPesado(c, c2);
		Boolean r2 = ac.compararOperadoras(c, c2);
		
		System.out.println("------------------------");
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Peso: " + c.getPeso());
		System.out.println("Operadora: " + telef.getOperadora());
		System.out.println("Numero de telefono: " + telef.getNumero());
		System.out.println("------------------------");
		System.out.println("Nombre: " + c2.getNombre());
		System.out.println("Apellido: " + c2.getApellido());
		System.out.println("Peso: " + c2.getPeso());
		System.out.println("Operadora: " + telef2.getOperadora());
		System.out.println("Numero de telefono: " + telef2.getNumero());
		System.out.println("------------------------");
		if(r1 != null) {
			System.out.println("Contacto Mas Pesado: " + r1.getNombre() + " " + r1.getApellido());
		} else {
			System.out.println("Contacto Mas Pesado: " + "Tienen el mismo peso");
		}
		System.out.println("Las Operadoras son iguales?: " + r2);
	}
}
