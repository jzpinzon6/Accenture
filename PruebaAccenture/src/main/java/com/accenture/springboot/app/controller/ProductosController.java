package com.accenture.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accenture.springboot.app.models.Producto;
import com.accenture.springboot.app.models.ResponseProductos;

/**
 * ProductosController
 * Esta clase define los métodos HTTP de interacción de la API de Productos con la capa de datos
 * @author Javier Pinzon
 */

@RestController
@RequestMapping("/producto")
public class ProductosController {

List<Producto> productos = new ArrayList<>();


	/**
	 * ver
	 * Método encargado de imprimir en pantalla los productos
	 * @author Javier Pinzon
	 * @return Retorna una lista con los productos creados
	 */
	@GetMapping(value = "/ver")
	public ResponseProductos ver() {
		
		ResponseProductos rp = new ResponseProductos();
		rp.setProductos(productos);
		
		return rp;
	}
	
	/**
	 * crearFactura
	 * Método encargado de crear productos en el sistema  
	 * @author Javier Pinzon
	 * @param recibe un objeto lista con un json de los productos disponibles
	 * @return Retorna un string con el mensaje de producto creado
	 */
	
	@PostMapping(value = "/crearProducto")
	public String crearUsuario(@RequestBody Producto request) {
				
		productos.add(new Producto(request.getId(), request.getNombre(), request.getPrecio()));
		
		for (Producto producto : productos) {
			System.out.println("Producto: " + producto.getId() + " " + producto.getNombre() + " " + request.getPrecio());
		}
		
	
		
		return "Producto Creado";
	}
	
}
