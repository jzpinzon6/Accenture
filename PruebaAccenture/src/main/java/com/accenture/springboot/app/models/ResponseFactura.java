package com.accenture.springboot.app.models;

import java.util.List;

/**
 * ResponseFactura
 * Clase que define la abstraccion del principio Inversion de dependencia para la clase factura y permite simular a traves de una lista las facturas 
 * @author Javier Pinzon
 */
public class ResponseFactura {
	private List<Factura> facturas;

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

}
