package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {

	// METODOS
	public static double calcularCuota(Prestamo prestamo) {
		double resultado = 0;
		double co = prestamo.getMonto();
		int n = prestamo.getPlazo();
		double i = (prestamo.getInteres() / 12) / 100;

		resultado = (co * i) / (1 - Math.pow(1 + i, -n));

		return resultado;
	}

	public static void generarTabla(Prestamo prestamo) {
		double valorCuota = calcularCuota(prestamo);
		Cuota[] arreglo = prestamo.getCuotas();
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota cuota = new Cuota(i + 1);
			cuota.setCuota(valorCuota);
			arreglo[i] = cuota;
		}
		arreglo[0].setInicio(prestamo.getMonto());

		for(int i = 0; i < arreglo.length; i++) {
		    Cuota cuotaActual = arreglo[i];
		    Cuota cuotaSiguiente = null;
		    if (i < arreglo.length - 1) {
		        cuotaSiguiente = arreglo[i + 1];
		    }
			
		    calcularValoresCuota(prestamo.getInteres(), cuotaActual, cuotaSiguiente);
		    
		    Cuota ultima = arreglo[arreglo.length - 1];
			if (ultima.getSaldo() != 0) {
			    double pendiente = ultima.getSaldo();
			    ultima.setCuota(ultima.getCuota() + pendiente);
			    ultima.setAbonoCapital(ultima.getAbonoCapital() + pendiente);
			    ultima.setSaldo(0);
			}
		}
	}

	public static void calcularValoresCuota(double interesAnual, Cuota cuotaActual, Cuota siguienteCouta) {
		double porcentaje = (interesAnual / 12) / 100;
		double interes = cuotaActual.getInicio() * porcentaje;
		cuotaActual.setInteres(interes);
		double abonoCapital = cuotaActual.getCuota() - interes;
		cuotaActual.setAbonoCapital(abonoCapital);
		double saldo = cuotaActual.getInicio() - abonoCapital;
		cuotaActual.setSaldo(saldo);
		
		if (siguienteCouta != null) {
	        siguienteCouta.setInicio(saldo);
	    }
	}
	
	public static void mostrarTabla(Prestamo prestamo) {
		generarTabla(prestamo);
		Cuota[] cuotas = prestamo.getCuotas();
		for(int i = 0; i < cuotas.length; i++) {
			Cuota cuotaAc = cuotas[i];
			cuotaAc.mostrarPrestamo();
		}
	}

}
