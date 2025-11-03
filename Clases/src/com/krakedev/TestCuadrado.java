package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		double area1;
		double area2;
		double area3;
		
		double perimetro1;
		double perimetro2;
		double perimetro3;
		
		c1.lado = 4;
		c2.lado = 10;
		c3.lado = 5;
		
		area1 = c1.calcularArea();
		area2 = c2.calcularArea();
		area3 = c3.calcularArea();
		
		perimetro1 = c1.calcularPerimetro();
		perimetro2 = c2.calcularPerimetro();
		perimetro3 = c3.calcularPerimetro();
		
		System.out.println("AREA 1: " + area1);
		System.out.println("PERIMETRO 1: " + perimetro1);
		System.out.println("----------------------");
		System.out.println("AREA 2: " + area2);
		System.out.println("PERIMETRO 2: " + perimetro2);
		System.out.println("----------------------");
		System.out.println("AREA 3: " + area3);
		System.out.println("PERIMETRO 3: " + perimetro3);
		
	}
}
