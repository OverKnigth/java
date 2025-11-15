package com.cmc.evaluacion.entidades;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;

	// CONSTRUCTOR
	public Cuota(int numero) {
		this.numero = numero;
	}

	// METODOS
	public void mostrarPrestamo() {
		System.out.println("------------------------------------------------------");
		System.out.println("N°  | Cuota  | Inicio  | Interés  | Abono Capital | Saldo");
		System.out.println("------------------------------------------------------");
		System.out.println(numero + "   | " + cuota + " | " + inicio + "  |   " + interes + "   | "
				+ abonoCapital + "      | " + saldo);
	}

	// GETTERS Y SETTERS
	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = Utilitario.redondear(cuota);
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = Utilitario.redondear(capital);
	}

	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = Utilitario.redondear(inicio);
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = Utilitario.redondear(interes);
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = Utilitario.redondear(abonoCapital);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = Utilitario.redondear(saldo);
	}

}
