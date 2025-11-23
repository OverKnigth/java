package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	// CREAR EL LOGGER PARA LOS ERRORES
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	// METODO PARA INSERTAR EN LA BASE DE DATOS
	public static void insertar(Persona persona) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE PERSONA LLEGO
		LOGGER.trace("PERSONA A INSERTAR: " + persona);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar();

			// PREPARAR EL INSERT
			ps = con.prepareStatement(
					"insert into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura, catidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			// EJECUTAR LA SENTANCIA DE INSERCION ------------------------------
			ps.executeUpdate();
			
		} catch (Exception e) {
			// EN LUGAR DEL STACKTRACE PONER EL LOGGER
			LOGGER.error("ERROR AL INSERTAR", e);
			// MENSAJE QUE SE VA A VISUALIZAR
			throw new Exception("ERROR AL INSERTAR");
		} finally {
			// CERRAR LA CONEXION CON LA BASE CON FINALLY Y CLOSE
			try {
				con.close();
			} catch (SQLException e) {
				// EN LUGAR DEL STACKTRACE PONER EL LOGGER
				LOGGER.error("ERROR EN LA BASE DE DATOS", e);
				// MENSAJE A VISUALIZAR
				throw new Exception("ERROR EN LA BASE DE DATOS");
			}
		}
	}
}
