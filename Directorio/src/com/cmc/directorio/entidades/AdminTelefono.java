package com.cmc.directorio.entidades;

public class AdminTelefono {
	//METODOS
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora() == "Movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telef1, Telefono telef2, Telefono telef3) {
		int conteo = 0;
		if(telef1.getOperadora() == "Movi") {
			conteo++;
		} 
		if(telef2.getOperadora() == "Movi") {
			conteo++;
		} 
		if(telef3.getOperadora() == "Movi") {
			conteo++;
		}
		return conteo;
	}
	
	public int contarClaro(Telefono telef1, Telefono telef2, Telefono telef3, Telefono telef4) {
		int conteo = 0;
		if(telef1.getOperadora() == "Claro") {
			conteo++;
		} 
		if(telef2.getOperadora() == "Claro") {
			conteo++;
		} 
		if(telef3.getOperadora() == "Claro") {
			conteo++;
		}
		if(telef4.getOperadora() == "Claro") {
			conteo++;
		}
		return conteo;
	}
}
