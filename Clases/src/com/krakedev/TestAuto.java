package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		auto1.marca = "Ford";
		auto2.marca = "Kia";

		auto1.anio = 2025;
		auto2.anio = 2024;

		auto1.precio = 14500.65;
		auto2.precio = 23000.52;

		System.out.println("AUTO 1");
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		System.out.println("--------------------------");
		System.out.println("AUTO 2");
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}
}
