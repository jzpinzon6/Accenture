package com.accenture.springboot.app.models;

import java.util.List;

/**
 * ResponseCliente
 * Clase que define la abstraccion del principio Inversion de dependencia para la clase cliente y permite simular a traves de una lista de clientes 
 * @author Javier Pinzon
 */

public class ResponseCliente {

	private List<Cliente> clientes;

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
