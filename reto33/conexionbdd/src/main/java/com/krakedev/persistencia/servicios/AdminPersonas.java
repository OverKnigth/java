package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

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
			con = ConexionBDD.conectar("prueba");
			// PREPARAR EL INSERT
			ps = con.prepareStatement(
					"insert into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura, cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
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

	// METODO PARA ACTUALIZAR EN LA BASE DE DATOS
	public static void actualizar(Persona persona) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE PERSONA LLEGO
		LOGGER.trace("PERSONA A ACTUALIZAR: " + persona);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("prueba");
			// PREPARAR EL UPDATE
			ps = con.prepareStatement(
					"update personas set nombre=?, apellido=?, estado_civil_codigo=?, numero_hijos=?, estatura=?, cantidad_ahorrada=?, fecha_nacimiento=?, hora_nacimiento=?"
							+ " where cedula=?");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());
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
	public static void eliminar(String cedula) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE PERSONA LLEGO
		LOGGER.trace("PERSONA A ELIMAR CON CEDULA: " + cedula);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("prueba");
			// PREPARAR EL DELETE
			ps = con.prepareStatement("delete from personas where cedula=?");
			ps.setString(1, cedula);
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
	public static ArrayList<Persona> buscarPorNombre(String nombreBuscado) throws Exception {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
				Connection con = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				// SABER QUE NOMBRE LLEGO
				LOGGER.trace("PERSONA A BUSCAR CON NOMBRE: " + nombreBuscado);
				try {
					// LLAMAR A LA CONEXION
					con = ConexionBDD.conectar("prueba");
					// PREPARAR LA BUSQUEDA
					ps = con.prepareStatement("select * from personas where nombre like ?");
					ps.setString(1, "%" + nombreBuscado + "%");
					// EJECUTAR LA SENTANCIA DE INSERCION CON EXCEUTEQUERY ------------------
					rs = ps.executeQuery();
					// TRAER A LOS RESULTADOS
					while(rs.next()) {
						// ALMACENAR LOS RESULTADOS EN VARIABLES
						String nombre = rs.getString("nombre");
						String cedula = rs.getString("cedula");
						// CREAR UN OBJETO PERSONA CON LOS RESULTADOS
						Persona p = new Persona();
						p.setNombre(nombre);
						p.setCedula(cedula);
						// AGREGAR PERSONA AL ARREGLO
						personas.add(p);
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
		return personas;
	}
}
