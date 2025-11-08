package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int conteo;
		Telefono telef = new Telefono(20, "Movi", "098234234");
		Telefono telef2 = new Telefono(15, "Claro", "098234520");
		Telefono telef3 = new Telefono(12, "Movi", "098234654");
		
		AdminTelefono at = new AdminTelefono();
		
		conteo = at.contarMovi(telef, telef2, telef3);
		
		System.out.println("Operadoras Movi: " + conteo);
	}
}
