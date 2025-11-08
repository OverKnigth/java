package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono(10, "Movi", "09941234123");
		
		System.out.println("Operadora: " + telef.getOperadora());
		System.out.println("Codigo: " + telef.getCodigo());
		System.out.println("Numero: " + telef.getNumero());
	}
}
