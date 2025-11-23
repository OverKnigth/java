package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Grupo;
import com.krakedev.persistencia.servicios.AdminGrupos;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminGrupo {

	public static void main(String[] args) {
		Grupo g = new Grupo(12, "Farmacologia I");
		try {
			// DEFINIR LA FECHA A INSERTAR
			Date fecha = Convertidor.convertirFecha("2025-11-23");
			g.setFecha_creacion(fecha);
			// DEFINIR DESCRIPCION
			g.setDescripcion("FARMACOLOGIA MATUTINO");
			// INSERTAR EN LA BASE DE DATOS
			AdminGrupos.insertar(g);
		} catch (Exception e) {
			// MANEJAR LOS ERRORES
			System.out.println("ERROR EN EL SISTEMA: " + e.getMessage());
		}
	}

}
