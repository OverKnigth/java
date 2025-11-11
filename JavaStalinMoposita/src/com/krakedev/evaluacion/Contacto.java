package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	// CONSTRUCTOR
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<Telefono>();
	}

	// METODOS
	public void imprimir() {
		Direccion d = direccion;
		System.out.println("-----------------------------------------------");
		System.out.println("Cedula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Direccion:");
		if (d == null) {
			System.out.println("  No tiene una direccion asociada.");
		} else {
			System.out.println("  Calle Principal: " + d.getCallePrincipal());
			System.out.println("  Calle Secundaria: " + d.getCalleSecundaria());
		}
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
		System.out.println("TELEFONO AGREGADO");
	}

	public void mostrarTelefonos() {
		Telefono telE;
		System.out.println("------------------------------------");
		System.out.println("Telefonos con estado 'C': ");
		for (int i = 0; i < telefonos.size(); i++) {
			telE = telefonos.get(i);
			if(telE.getEstado().equalsIgnoreCase("C")) {
				System.out.println("Numero: " + telE.getNumero() + ", Tipo: " + telE.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos(){
		Telefono telE;
		ArrayList<Telefono> incorrectos = new ArrayList<Telefono>();
		for (int i = 0; i < telefonos.size(); i++) {
			telE = telefonos.get(i);
			if(telE.getEstado().equalsIgnoreCase("E")) {
				incorrectos.add(telE);
			}
		}
		return incorrectos;
	}

	// GETERRS Y SETTERS
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

}
