package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rec = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();
		int area;
		int area2;
		double perimetro1;
		double perimetro2;
		rec.altura = 4;
		rec.base = 2;
		area = rec.calcularArea();
		perimetro1 = rec.calcularPerimetro();
		
		rec2.altura = 5;
		rec2.base = 9;
		area2 = rec2.calcularArea();
		perimetro2 = rec2.calcularPerimetro();
		
		System.out.println("AREA: " + area);
		System.out.println("PERIMETRO: " + perimetro1);
		System.out.println("-------------------------------");
		System.out.println("AREA 2: " + area2);
		System.out.println("PERIMETRO 2: " + perimetro2);
	}
}
