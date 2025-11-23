package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					// CONEXION
					"jdbc:postgresql://localhost:5432/prueba",
					// USUARIO
					"postgres",
					// PASSWORD
					"12345");
			System.out.println("Conexion Exitosa");
			// INSERTAR DATOS
			ps = connection.prepareStatement(
					"insert into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura, catidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
							+ "values(?,?,?,?, ?, ?, ?, ?, ?)");
			ps.setString(1, "1721870010");
			ps.setString(2, "Stalin");
			ps.setString(3, "Moposita");
			ps.setString(4, "S");
			ps.setInt(5, 1);
			ps.setDouble(6, 1.73);
			ps.setBigDecimal(7, new BigDecimal(500.31));
			// FECHA Y HORA ----------------------------------------------------
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String fechaStr = "2025/11/22 10:30:20";
			// Import DATE DE util.Date
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				// FECHA EN MILIS
				long fechaMil = fecha.getTime();
				System.out.println(fechaMil);
				// FECHA A FECHA SQL
				java.sql.Date fechaSQL = new java.sql.Date(fechaMil);
				System.out.println(fechaSQL);
				// OBTENER LA HORA
				Time t = new Time(fechaMil);
				System.out.println(t);

				// VALORES PARA LA HORA Y FECHA
				ps.setDate(8, fechaSQL);
				ps.setTime(9, t);

				// EJECUTAR LA SENTANCIA DE INSERCION ------------------------------
				ps.executeUpdate();
				System.out.println("Insert hecho");

			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
