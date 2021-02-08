package com.accenture.springboot.app.models;

/**
 * Producto
 * Clase que define metodos que permiten definir los atributos y metodos de de los objetos productos
 * @author Javier Pinzon
 */

public class Producto {

	private Integer id;
	private String nombre;
	private Integer precio;

	public Producto(Integer id, String nombre, Integer precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

}
