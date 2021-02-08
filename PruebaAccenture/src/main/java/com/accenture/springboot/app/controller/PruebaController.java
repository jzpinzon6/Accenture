package com.accenture.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accenture.springboot.app.models.Cliente;
import com.accenture.springboot.app.models.ResponseCliente;

/**
 * PurebaController
 * Esta clase define los métodos HTTP de interacción de la API de Clientes con la capa de datos
 * @author Javier Pinzon
 */


@RestController
@RequestMapping("/cliente")
public class PruebaController {

	List<Cliente> usuarios = new ArrayList<>();
		
	/**
	 * ver
	 * Método encargado de imprimir en pantalla los clientes registrados en el sistema
	 * @author Javier Pinzon
	 * @return Retorna una lista con los productos creados
	 */
	
	@GetMapping(value = "/ver")
	public ResponseCliente ver() {
		
		ResponseCliente rc = new ResponseCliente();
		rc.setClientes(usuarios);
		
		return rc;
	}
	
	/**
	 * crearUsuario
	 * Método encargado de crear usuarios en el sistema  
	 * @author Javier Pinzon
	 * @param recibe un objeto lista con un json de los usuarios registrados
	 * @return Retorna un string con el mensaje de usuario creado
	 */
	
	@PostMapping(value = "/crearUsuario")
	public String crearUsuario(@RequestBody Cliente request) {
				
		usuarios.add(new Cliente(request.getNombre(), request.getApellido(), request.getDireccion(), request.getCedula()));
		
		for (Cliente cliente : usuarios) {
			System.out.println("Cliente "+ cliente.getNombre() + " " + cliente.getApellido()+ " " + cliente.getDireccion()  + " " + cliente.getCedula());
		}
		
	
		
		return "Usuario Creado";
	}
			
}