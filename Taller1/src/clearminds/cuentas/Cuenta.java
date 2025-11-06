package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	//CONSTRUCTORES:
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}
	
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	//METODOS:
	public void imprimir() {
		System.out.println("****************");
		System.out.println("CUENTA");
		System.out.println("****************");
		System.out.println("Numero de Cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: USD " + saldo);
		
	}
	
	public void imprimirConEstilo() {
		System.out.println("------------------");
		System.out.println("DATOS DE LA CUENTA");
		System.out.println("INFORMACION CONFIDENCIAL");
		System.out.println("------------------");
		System.out.println("Numero de Cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: USD " + saldo);
		System.out.println("GRACIAS POR ELEGIR NUESTRO BANCO :3");
		System.out.println("------------------");
	}
	
	//GETTERS Y SETTERS:
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
