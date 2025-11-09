package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	//METODOS
	public void configurarMaquina(String codigoC1, String codigoC2, String codigoC3, String codigoC4) {
		celda1 = new Celda(codigoC1);
		celda2 = new Celda(codigoC2);
		celda3 = new Celda(codigoC3);
		celda4 = new Celda(codigoC4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("Codigo Celda 1: " + celda1.getCodigo());
		System.out.println("Codigo Celda 2: " + celda2.getCodigo());
		System.out.println("Codigo Celda 3: " + celda3.getCodigo());
		System.out.println("Codigo Celda 4: " + celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		if(codigo == celda1.getCodigo()) {
			return celda1;
		} else if(codigo == celda2.getCodigo()) {
			return celda2;
		} else if(codigo == celda3.getCodigo()) {
			return celda3;
		} else if(codigo == celda4.getCodigo()) {
			return celda4; 
		} else {
			return null;
		}
	}
	
	public void cargarProducto(Producto producto, String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if(celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, items);
		} else {
			System.out.println("ERROR, VERIFIQUE LOS DATOS INGRESADOS");
		}
	}
	
	public void mostrarProductos() {
		System.out.println("-----------------------------");
		System.out.println("CODIGO: " + celda1.getCodigo());
		if(celda1.getProducto() != null) {
			System.out.println("NOMBRE: " + celda1.getProducto().getNombre());
			System.out.println("PRECIO: " + celda1.getProducto().getPrecio());
		}else {
			System.out.println("Sin Productos :(");
		}
		System.out.println("STOCK: " + celda1.getStock());
		System.out.println("-----------------------------");
		System.out.println("CODIGO: " + celda2.getCodigo());
		if(celda2.getProducto() != null) {
			System.out.println("NOMBRE: " + celda2.getProducto().getNombre());
			System.out.println("PRECIO: " + celda2.getProducto().getPrecio());
		}else {
			System.out.println("Sin Productos :(");
		}
		System.out.println("STOCK: " + celda2.getStock());
		System.out.println("-----------------------------");
		System.out.println("CODIGO: " + celda3.getCodigo());
		if(celda3.getProducto() != null) {
			System.out.println("NOMBRE: " + celda3.getProducto().getNombre());
			System.out.println("PRECIO: " + celda3.getProducto().getPrecio());
		}else {
			System.out.println("Sin Productos :(");
		}
		System.out.println("STOCK: " + celda3.getStock());
		System.out.println("-----------------------------");
		System.out.println("CODIGO: " + celda4.getCodigo());
		if(celda4.getProducto() != null) {
			System.out.println("NOMBRE: " + celda4.getProducto().getNombre());
			System.out.println("PRECIO: " + celda4.getProducto().getPrecio());
		}else {
			System.out.println("Sin Productos :(");
		}
		System.out.println("STOCK: " + celda4.getStock());
		System.out.println("-----------------------------");
		System.out.println("Saldo: " + this.saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		if(codigo == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if(codigo == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if(codigo == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if(codigo == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}
	
	public double consultarPrecio(String codigo) {
		if(codigo == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if(codigo == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if(codigo == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if(codigo == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}
	}
	
	public Celda buscarCeldaProducto(String codigo) {
		Producto pr1 = celda1.getProducto();
		Producto pr2 = celda2.getProducto();
		Producto pr3 = celda3.getProducto();
		Producto pr4 = celda4.getProducto();
		if (pr1 != null && codigo == pr1.getCodigo()) {
		    return celda1;
		} 
		else if (pr2 != null && codigo == pr2.getCodigo()) {
		    return celda2;
		}
		else if (pr3 != null && codigo == pr3.getCodigo()) {
		    return celda3;
		}
		else if (pr4 != null && codigo == pr4.getCodigo()) {
		    return celda4;
		}
		else {
		    return null;
		}

	}
	
	public void incrementarProductos(String codigo, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int stockN = celdaEncontrada.getStock() + items;
		celdaEncontrada.setStock(stockN);
	}
	
	public void vender(String codigo) {
		if(codigo == celda1.getCodigo()) {
			int stock = celda1.getStock() - 1;
			celda1.setStock(stock);
			this.saldo = this.saldo + celda1.getProducto().getPrecio();
		}
		if(codigo == celda2.getCodigo()) {
			int stock = celda2.getStock() - 1;
			celda2.setStock(stock);
			this.saldo = this.saldo + celda2.getProducto().getPrecio();
		}
		if(codigo == celda3.getCodigo()) {
			int stock = celda3.getStock() - 1;
			celda3.setStock(stock);
			this.saldo = this.saldo + celda3.getProducto().getPrecio();
		}
		if(codigo == celda4.getCodigo()) {
			int stock = celda4.getStock() - 1;
			celda4.setStock(stock);
			this.saldo = this.saldo + celda4.getProducto().getPrecio();
		}
	}
	
	public double venderConCambio(String codigo, double valor) {
		if(codigo == celda1.getCodigo()) {
			int stock = celda1.getStock() - 1;
			celda1.setStock(stock);
			this.saldo = this.saldo + celda1.getProducto().getPrecio();
			double cambio;
			cambio = valor - celda1.getProducto().getPrecio();
			return cambio;
		}
		else if(codigo == celda2.getCodigo()) {
			int stock = celda2.getStock() - 1;
			celda1.setStock(stock);
			this.saldo = this.saldo + celda2.getProducto().getPrecio();
			double cambio;
			cambio = valor - celda2.getProducto().getPrecio();
			return cambio;
		}
		else if(codigo == celda3.getCodigo()) {
			int stock = celda3.getStock() - 1;
			celda1.setStock(stock);
			this.saldo = this.saldo + celda3.getProducto().getPrecio();
			double cambio;
			cambio = valor - celda3.getProducto().getPrecio();
			return cambio;
		}
		else if(codigo == celda4.getCodigo()) {
			int stock = celda4.getStock() - 1;
			celda1.setStock(stock);
			this.saldo = this.saldo + celda4.getProducto().getPrecio();
			double cambio;
			cambio = valor - celda4.getProducto().getPrecio();
			return cambio;
		}
		else {
			return 0.0;
		}
	}
	
	//GETTERS Y SETTERS
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
