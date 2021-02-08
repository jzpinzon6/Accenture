package com.accenture.springboot.app.models;

/**
 * ResponseProductos
 * Clase que define la abstraccion del principio Inversion de dependencia para la clase producto y permite simular a traves de una lista los productos 
 * @author Javier Pinzon
 */

import java.util.List;

public class ResponseProductos {

	private List<Producto> productos;

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
