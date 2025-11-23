package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy-MM-dd";
	private static final String FORMATO_HORA = "HH:mm";

	// CREAR EL LOGGER PARA LOS ERRORES
	private static final Logger LOGGER = LogManager.getLogger(Convertidor.class);

	public static Date convertirFecha(String fecha) throws Exception {
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		try {
			d = sdf.parse(fecha);
		} catch (ParseException e) {
			LOGGER.error("ERROR EN EL FORMATO DE FECHA", e);
			throw new Exception("ERROR EN EL FORMATO DE FECHA");
		}
		return d;
	}

	public static Date convertirHora(String hora) throws Exception {
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		try {
			d = sdf.parse(hora);
		} catch (ParseException e) {
			LOGGER.error("ERROR EN EL FORMATO DE HORA", e);
			throw new Exception("ERROR EN EL FORMATO DE HORA");
		}
		return d;
	}
}
