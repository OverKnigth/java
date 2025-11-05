package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado(4);
		Cuadrado c2 = new Cuadrado(10);
		Cuadrado c3 = new Cuadrado(5);
		
		double area1;
		double area2;
		double area3;
		
		double perimetro1;
		double perimetro2;
		double perimetro3;
		
		area1 = c1.calcularArea();
		area2 = c2.calcularArea();
		area3 = c3.calcularArea();
		
		perimetro1 = c1.calcularPerimetro();
		perimetro2 = c2.calcularPerimetro();
		perimetro3 = c3.calcularPerimetro();
		
		System.out.println("VALOR DEL LADO: " + c1.getLado());
		System.out.println("AREA 1: " + area1);
		System.out.println("PERIMETRO 1: " + perimetro1);
		System.out.println("----------------------");
		System.out.println("VALOR DEL LADO: " + c2.getLado());
		System.out.println("AREA 2: " + area2);
		System.out.println("PERIMETRO 2: " + perimetro2);
		System.out.println("----------------------");
		System.out.println("VALOR DEL LADO: " + c3.getLado());
		System.out.println("AREA 3: " + area3);
		System.out.println("PERIMETRO 3: " + perimetro3);
		
	}
}
