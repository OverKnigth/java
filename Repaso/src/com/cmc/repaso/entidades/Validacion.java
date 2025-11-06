package com.cmc.repaso.entidades;

public class Validacion {
	public void validarMonto(double monto) {
		if(monto > 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
