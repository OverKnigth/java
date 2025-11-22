package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fechaStr = "2025/11/22 10:30:20";
		//Import DATE DE util.Date
		try {
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			//FECHA EN MILIS
			long fechaMil = fecha.getTime();
			System.out.println(fechaMil);
			//FECHA A FECHA SQL
			java.sql.Date fechaSQL = new java.sql.Date(fechaMil);
			System.out.println(fechaSQL);
			//OBTENER LA HORA
			Time t = new Time(fechaMil);
			System.out.println(t);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
