package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// OBJETOS:
		Cuenta c1 = new Cuenta("03476");
		Cuenta c2 = new Cuenta("03476", "C", 98);
		Cuenta c3 = new Cuenta("03476");

		// DATOS:
		c1.setSaldo(675);
		c3.setTipo("C");

		// IMPRIMIR:
		System.out.println("----VALORES INICIALES----");
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();

		// DATOS MODIFICADOS:
		c1.setSaldo(444);
		c3.setSaldo(567);
		c2.setTipo("D");

		// IMPRIMIR:
		System.out.println(" ");
		System.out.println("----VALORES MODIFICADOS----");
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();

		// NUEVOS OBJETOS:
		Cuenta c4 = new Cuenta("0987");
		Cuenta c5 = new Cuenta("0557", "C", 10);
		Cuenta c6 = new Cuenta("0666");

		// DATOS MODIFICADOS:
		c4.setSaldo(10);
		
		// IMPRIMIR CON ESTILO:
		System.out.println(" ");
		System.out.println("----VALORES CON ESTILO :3----");
		c4.imprimirConEstilo();
		c5.imprimirConEstilo();
		c6.imprimirConEstilo();

	}
}
