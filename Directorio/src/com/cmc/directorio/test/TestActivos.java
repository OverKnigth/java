package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono(20, "Movi", "098234234");
		Contacto c = new Contacto("Juan", "Perez", telef, 50.5);
		AdminContactos ac = new AdminContactos();
		AdminTelefono at = new AdminTelefono();
		
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Operadora: " + telef.getOperadora());
		System.out.println("Numero: " + telef.getNumero());
		System.out.println("Tiene Whatsapp: " + telef.isTieneWhatsapp());
		System.out.println("Activo: " + c.isActivo());
		
		at.activarMensajeria(telef);
		ac.activarUsuario(c);
		
		System.out.println("-------------------------");
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Operadora: " + telef.getOperadora());
		System.out.println("Numero: " + telef.getNumero());
		System.out.println("Tiene Whatsapp: " + telef.isTieneWhatsapp());
		System.out.println("Activo: " + c.isActivo());
		
	}

}
