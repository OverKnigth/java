package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Grupo;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminGrupos {
	// CREAR EL LOGGER PARA LOS ERRORES
	private static final Logger LOGGER = LogManager.getLogger(AdminGrupos.class);

	// METODO PARA INSERTAR EN LA BASE DE DATOS
	public static void insertar(Grupo grupo) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE GRUPO LLEGO
		LOGGER.trace("GRUPO A INSERTAR: " + grupo);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("ejercicios");
			// PREPARAR EL INSERT
			ps = con.prepareStatement(
					"insert into grupo(id, nombre, descripcion, fecha_creacion)"
							+ "values(?,?,?,?)");
			ps.setInt(1, grupo.getId());
			ps.setString(2, grupo.getNombre());
			ps.setString(3, grupo.getDescripcion());
			ps.setDate(4, new java.sql.Date(grupo.getFecha_creacion().getTime()));
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

	// METODO PARA ACTUALIZAR EN LA BASE DE DATOS
	public static void actualizar(Grupo grupo) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE GRUPO LLEGO
		LOGGER.trace("GRUPO A ACTUALIZAR: " + grupo);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("ejercicios");
			// PREPARAR EL UPDATE
			ps = con.prepareStatement(
					"update grupo set nombre=?, descripcion=?, fecha_creacion=?"
							+ " where id=?");
			ps.setString(1, grupo.getNombre());
			ps.setString(2, grupo.getDescripcion());
			ps.setDate(3, new java.sql.Date(grupo.getFecha_creacion().getTime()));
			ps.setInt(4, grupo.getId());
			// EJECUTAR LA SENTANCIA DE INSERCION ------------------------------
			ps.executeUpdate();

		} catch (Exception e) {
			// EN LUGAR DEL STACKTRACE PONER EL LOGGER
			LOGGER.error("ERROR AL ACTUALIZAR", e);
			// MENSAJE QUE SE VA A VISUALIZAR
			throw new Exception("ERROR AL ACTUALIZAR");
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

	// METODO PARA ELIMIAR EN LA BASE DE DATOS
	public static void eliminar(int id) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE GRUPO LLEGO
		LOGGER.trace("GRUPO A ELIMAR CON ID: " + id);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("ejercicios");
			// PREPARAR EL DELETE
			ps = con.prepareStatement("delete from grupo where id=?");
			ps.setInt(1, id);
			// EJECUTAR LA SENTANCIA DE INSERCION ------------------------------
			ps.executeUpdate();

		} catch (Exception e) {
			// EN LUGAR DEL STACKTRACE PONER EL LOGGER
			LOGGER.error("ERROR AL ELIMINAR", e);
			// MENSAJE QUE SE VA A VISUALIZAR
			throw new Exception("ERROR AL ELIMINAR");
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
