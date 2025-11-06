package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rec = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();
		int area;
		int area2;
		double perimetro1;
		double perimetro2;
		rec.setAltura(4);
		rec.setBase(2);
		area = rec.calcularArea();
		perimetro1 = rec.calcularPerimetro();
		
		rec2.setAltura(5);
		rec2.setBase(9);
		area2 = rec2.calcularArea();
		perimetro2 = rec2.calcularPerimetro();
		
		System.out.println("ALTURA: " + rec.getAltura());
		System.out.println("BASE: " + rec.getBase());
		System.out.println("AREA: " + area);
		System.out.println("PERIMETRO: " + perimetro1);
		System.out.println("-------------------------------");
		System.out.println("ALTURA: " + rec2.getAltura());
		System.out.println("BASE: " + rec2.getBase());
		System.out.println("AREA 2: " + area2);
		System.out.println("PERIMETRO 2: " + perimetro2);
	}
}
