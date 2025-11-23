package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexiones2 {
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
					"insert into productos(codigo, nombre, descripcion, precio, stock)" + "values(?,?,?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "Whisky");
			ps.setString(3, "Bebica alcoholica");
			ps.setBigDecimal(4, new BigDecimal(12.50));
			ps.setInt(5, 100);
			// EJECUTAR LA SENTANCIA DE INSERCION ------------------------------
			ps.executeUpdate();
			System.out.println("Insert hecho");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
