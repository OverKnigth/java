package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	// CONSTRUCTOR
	public Banco() {
		prestamos = new ArrayList<Prestamo>();
		clientes = new ArrayList<Cliente>();
	}

	// METODOS
	public Cliente buscarClientes(String cedula) {
		Cliente resultado = null;
		Cliente clienteE;
		for (int i = 0; i < clientes.size(); i++) {
			clienteE = clientes.get(i);
			if(cedula.equals(clienteE.getCedula())) {
				resultado = clienteE;
			}
		}
		return resultado;
	}
	
	public void registrarCliente(Cliente cliente) {
		Cliente clienteE = buscarClientes(cliente.getCedula());
		if(clienteE != null) {
			System.out.println("Cliente con cedula: "  + clienteE.getCedula() + " YA ESTA REGISTRADO");
		} else {
			System.out.println("CLIENTE AGREGADO CON EXITO");
			clientes.add(cliente);
		}
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		 Cliente clienteE = buscarClientes(cedula);
		    if (clienteE == null) {
		        System.out.println("NO ES CLIENTE DEL BANCO");
		    } else {
		    	clienteE.getPrestamos().add(prestamo);
		        CalculadoraAmortizacion.generarTabla(prestamo);
		    }
		
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> resultados = new ArrayList<Prestamo>();
	    Cliente clienteE = buscarClientes(cedula);
	    if (clienteE != null) {
	        resultados =  clienteE.getPrestamos(); 
	    }
	    return resultados;
	}



	// GETTERS
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
}
