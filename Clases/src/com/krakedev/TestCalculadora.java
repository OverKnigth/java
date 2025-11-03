package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDividir;
		double resultadoPromedio;
		resultadoSuma = c.sumar(1, 2);
		resultadoResta =c.restar(5, 2);
		resultadoMultiplicacion = c.multiplicar(5, 10);
		resultadoDividir = c.dividir(10, 2);
		resultadoPromedio = c.promediar(10, 8, 9);
		
		System.out.println("Resultado Suma: " + resultadoSuma);
		System.out.println("Resultado Resta: " + resultadoResta);
		System.out.println("Resultado Multiplicacion: " + resultadoMultiplicacion);
		System.out.println("Resultado Division: " + resultadoDividir);
		System.out.println("Resultado Promedio: " + resultadoPromedio);
		c.mostrarResultado();
	}
}
