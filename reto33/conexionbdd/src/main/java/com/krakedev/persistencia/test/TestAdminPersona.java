package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1721870011", "Santiago", "Landeta", ec);
		try {
			// DEFINIR LA FECHA A INSERTAR
			Date fecha = Convertidor.convertirFecha("2025-11-20");
			p.setFechaNacimiento(fecha);
			// DEFINIR LA HORA A INSERTAR
			Date hora = Convertidor.convertirHora("10:21");
			p.setHoraNacimiento(hora);
			// DEFINIR EL BIG DECIMAL
			p.setCantidadAhorrada(new BigDecimal(102.32));
			// DEFINIR UN DOUBLE
			p.setEstatura(1.73);
			// DEFINIR UN INT
			p.setNumeroHijos(2);
			// INSERTAR EN LA BASE DE DATOS
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			// MANEJAR LOS ERRORES
			System.out.println("ERROR EN EL SISTEMA: " + e.getMessage());
		}
	}
}
