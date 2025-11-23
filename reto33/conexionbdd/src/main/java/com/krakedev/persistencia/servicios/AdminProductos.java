package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminProductos {
	// CREAR EL LOGGER PARA LOS ERRORES
	private static final Logger LOGGER = LogManager.getLogger(AdminProductos.class);

	// METODO PARA INSERTAR EN LA BASE DE DATOS
	public static void insertar(Producto producto) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE PRODUCTO LLEGO
		LOGGER.trace("PRODUCTO A INSERTAR: " + producto);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("prueba");
			// PREPARAR EL INSERT
			ps = con.prepareStatement(
					"insert into productos(codigo, nombre, descripcion, precio, stock)"
							+ "values(?,?,?,?,?)");
			ps.setInt(1, producto.getCodigo());
			ps.setString(2, producto.getNombre());
			ps.setString(3, producto.getDescripcion());
			ps.setBigDecimal(4, producto.getPrecio());
			ps.setInt(5, producto.getStock());
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
	public static void actualizar(Producto producto) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE PRODUCTO LLEGO
		LOGGER.trace("PRODUCTO A ACTUALIZAR: " + producto);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("prueba");
			// PREPARAR EL UPDATE
			ps = con.prepareStatement(
					"update productos set nombre=?, descripcion=?, precio=?, stock=?"
							+ " where codigo=?");
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setBigDecimal(3, producto.getPrecio());
			ps.setInt(4, producto.getStock());
			ps.setInt(5, producto.getCodigo());
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
	public static void eliminar(int codigo) throws Exception {
		// LLAMAR AL METODO DE CONEXION CON LA BASE DE DATOS
		Connection con = null;
		PreparedStatement ps = null;
		// SABER QUE PRODUCTO LLEGO
		LOGGER.trace("PRODUCTO A ELIMAR CON CODIGO: " + codigo);
		try {
			// LLAMAR A LA CONEXION
			con = ConexionBDD.conectar("prueba");
			// PREPARAR EL DELETE
			ps = con.prepareStatement("delete from productos where codigo=?");
			ps.setInt(1, codigo);
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
