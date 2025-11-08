package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int conteo1;
		int conteo2;
		Telefono telef = new Telefono(20, "Movi", "098234234");
		Telefono telef2 = new Telefono(15, "Claro", "098234520");
		Telefono telef3 = new Telefono(12, "Claro", "098234654");
		Telefono telef4 = new Telefono(18, "Claro", "098234753");
		
		AdminTelefono at = new AdminTelefono();
		
		conteo1 = at.contarMovi(telef, telef2, telef3);
		conteo2 = at.contarClaro(telef, telef2, telef3, telef4);
		
		System.out.println("Operadoras Movi: " + conteo1);
		System.out.println("Operadoras Claro: " + conteo2);
	}
}
