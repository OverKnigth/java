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

public class TestConexion3 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					// CONEXION
					"jdbc:postgresql://localhost:5432/ejercicios",
					// USUARIO
					"postgres",
					// PASSWORD
					"12345");
			System.out.println("Conexion Exitosa");
			// INSERTAR DATOS
			ps = connection
					.prepareStatement("insert into grupo(id, nombre, descripcion, fecha_creacion)" + "values(?,?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "Anatomia");
			ps.setString(3, "Grupo de anatomia matutino, lunes a viernes");
			// FECHA Y HORA ----------------------------------------------------
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr = "2025/11/22";
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
				// VALORES PARA LA FECHA
				ps.setDate(4, fechaSQL);
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
