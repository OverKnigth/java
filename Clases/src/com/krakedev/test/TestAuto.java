package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto("Ford", 13500);
		Auto auto2 = new Auto("Ford", 13500);

		auto2.setMarca("Kia");

		auto1.setAnio(2025);
		auto2.setAnio(2024);

		auto2.setPrecio(23000.52);

		System.out.println("AUTO 1");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		System.out.println("--------------------------");
		System.out.println("AUTO 2");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}
}
