package com.krakedev.persistencia.entidades;

import java.util.Date;

public class Grupo {
	private int id;
	private String nombre;
	private String descripcion;
	private Date fecha_creacion;
	
	//CONSTRUCTORES
	public Grupo(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Grupo() {
		
	}

	//GETTERS Y SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
	//TO STRING SOBREESCRITO
	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_creacion="
				+ fecha_creacion + "]";
	}
}
