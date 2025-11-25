package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			ps = con.prepareStatement("insert into grupo(id, nombre, descripcion, fecha_creacion)" + "values(?,?,?,?)");
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
			ps = con.prepareStatement("update grupo set nombre=?, descripcion=?, fecha_creacion=?" + " where id=?");
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

	// METODO PARA HACER CONSULTAS
	public static ArrayList<Grupo> buscarPorNombre(String nombreBusqueda) throws Exception {
		ArrayList<Grupo> grupos = new ArrayList<Grupo>();
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// SABER QUE NOMBRE LLEGO
		LOGGER.trace("GRUPO A BUSCAR CON NOMBRE: " + nombreBusqueda);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("ejercicios");
			// PREPARAR LA BUSQUEDA
			ps = con.prepareStatement("select * from grupo where nombre like ?");
			ps.setString(1, "%" + nombreBusqueda + "%");
			// EJECUTAR LA SENTANCIA DE INSERCION CON EXCEUTEQUERY ------------------
			rs = ps.executeQuery();
			// TRAER A LOS RESULTADOS
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String descripcion = rs.getString("descripcion");
				Date fechaCreacion = rs.getDate("fecha_creacion");
				
				// ASIGNAR A UN OBJETO LOS RESULTADOS
				Grupo grupo = new Grupo();
				grupo.setId(id);
				grupo.setNombre(nombre);
				grupo.setDescripcion(descripcion);
				grupo.setFecha_creacion(fechaCreacion);
				// AGREGAR OBJETOS AL ARREGLO
				grupos.add(grupo);
			}

		} catch (Exception e) {
			// EN LUGAR DEL STACKTRACE PONER EL LOGGER
			LOGGER.error("ERROR AL CONSULTAR POR NOMBRE", e);
			// MENSAJE QUE SE VA A VISUALIZAR
			throw new Exception("ERROR AL CONSULTAR POR NOMBRE");
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
		return grupos;
	}

}
