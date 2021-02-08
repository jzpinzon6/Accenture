package com.accenture.springboot.app.models;

/**
 * Cliente
 * Clase que define metodos que permiten definir los atributos y metodos de de los objetos cliente
 * @author Javier Pinzon
 */

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private Integer cedula;

	public Cliente(String nombre, String apellido, String direccion, Integer cedula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
	
	

}
