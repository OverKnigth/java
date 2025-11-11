package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	// METODOS
	public boolean agregarContacto(Contacto contacto) {
		boolean resultado = false;
		String cedula = contacto.getCedula();
		if (buscarPorCedula(cedula) == null) {
			contactos.add(contacto);
			fechaModificacion = new Date();
			resultado = true;
		}
		return resultado;
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto resultado = null;
		Contacto contE;
		for (int i = 0; i < contactos.size(); i++) {
			contE = contactos.get(i);
			if (cedula.equals(contE.getCedula())) {
				resultado = contE;
			}
		}
		return resultado;
	}

	public String consultarUltimaModificacion() {
		String resultado = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		resultado = sdf.format(fechaModificacion);
		return resultado;
	}

	public int contarPerdidos() {
		int resultado = 0;
		Contacto contE;
		for (int i = 0; i < contactos.size(); i++) {
			contE = contactos.get(i);
			if (contE.getDireccion() == null) {
				resultado++;
			}
		}
		return resultado;
	}

	public int contarFijos() {
		int resultado = 0;
		Contacto contE;
		ArrayList<Telefono> telefE = new ArrayList<Telefono>();
		Telefono telefE2;
		for (int i = 0; i < contactos.size(); i++) {
			contE = contactos.get(i);
			telefE = contE.getTelefonos();
			for (int j = 0; j < telefE.size(); j++) {
				telefE2 = telefE.get(j);
				if(telefE2.getTipo().equalsIgnoreCase("Convencional") && telefE2.getEstado().equals("C")) {
					resultado++;
				}
			}
		}
		return resultado;
	}
	
	public void depurar() {
		Contacto contE;
		for (int i = 0; i < contactos.size(); i++) {
			contE = contactos.get(i);
			if (contE.getDireccion() == null) {
				incorrectos.add(contE);
			} else {
				correctos.add(contE);
			}
		}
		contactos.clear();
	}

	// GETTERS Y SETTERS
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

}
