package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono(20, "Movi", "098234234");
		AdminTelefono at = new AdminTelefono();
		
		System.out.println("Operadora: " + telef.getOperadora());
		System.out.println("Codigo: " + telef.getCodigo());
		System.out.println("Numero: " + telef.getNumero());
		System.out.println("Tiene Whatsapp: " + telef.isTieneWhatsapp());
		
		at.activarMensajeria(telef);
		
		System.out.println("----------------------------------");
		System.out.println("Operadora: " + telef.getOperadora());
		System.out.println("Codigo: " + telef.getCodigo());
		System.out.println("Numero: " + telef.getNumero());
		System.out.println("Tiene Whatsapp: " + telef.isTieneWhatsapp());
		
	}
}
