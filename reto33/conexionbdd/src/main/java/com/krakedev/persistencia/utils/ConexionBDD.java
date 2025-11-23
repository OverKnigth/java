package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	// CONSTANTES
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/";
	private static final String USUARIO = "postgres";
	private static final String PASSWORD = "12345";

	// CREAR EL LOGGER PARA LOS ERRORES
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);

	// METODO DE CONEXION
	public static Connection conectar(String base) throws Exception {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(
					// CONEXION URL
					URL + base,
					// USUARIO
					USUARIO,
					// PASSWORD
					PASSWORD);
			LOGGER.debug("CONEXION EXITOSA");
		} catch (ClassNotFoundException e) {
			LOGGER.error("ERROR EN LA INFRAESTRUCTURA", e);
			throw new Exception("ERROR EN LA INFRAESTRUCTURA");
		} catch (SQLException e) {
			LOGGER.error("ERROR AL CONECTAR CON LA BDD, REVISAR CLAVES", e);
			throw new Exception("ERROR AL CONECTAR CON LA BDD, REVISAR CLAVES");
		}
		return connection;
	}
}
