package com.accenture.springboot.app.models;

import java.util.List;


/**
 * Factura
 * Clase que define metodos que permiten definir los atributos y metodos de de los objetos facturas
 * @author Javier Pinzon
 */
public class Factura {

	private Integer idCliente;
	private List<Producto> productos;
	private String descripcion;
	private Integer total;
	private double precioProducto;

	public Factura(Integer idCliente, List<Producto> productos, String descripcion, Integer total) {
		this.idCliente = idCliente;
		this.productos = productos;
		this.descripcion = descripcion;
		this.total = total;	
	}

	public Factura(Integer idCliente2, List<Producto> productos2, String descripcion2, double getprecioProducto) {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public double getprecioProducto() {
		
		return precioProducto;
	}

	public void setprecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	
}
