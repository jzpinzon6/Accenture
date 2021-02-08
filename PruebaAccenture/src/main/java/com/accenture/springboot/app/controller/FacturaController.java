package com.accenture.springboot.app.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.springboot.app.models.Factura;
import com.accenture.springboot.app.models.ResponseFactura;
import com.google.gson.Gson;

/**
 * FacturaController
 * Esta clase define los métodos HTTP de interacción de la API de Factura con la capa de datos
 * @author Javier Pinzon
 */

@RestController
@RequestMapping("/factura")
public class FacturaController {

	List<Factura> facturas = new ArrayList<>();
	
	/**
	 * ver
	 * Método encargado de imprimir en pantalla la factura  
	 * @author Javier Pinzon
	 * @return Retorna una lista con la factura de los productos seleccionados
	 */
	@GetMapping(value = "/ver")
	public ResponseFactura ver() {
		
		ResponseFactura rf = new ResponseFactura();
		rf.setFacturas(facturas);
		
		return rf;
	}
	
	/**
	 * crearFactura
	 * Método encargado de crear la factura de los clientes  
	 * @author Javier Pinzon
	 * @param recibe un objeto lista con un json de los productos disponibles
	 * @return Retorna una lista con los productos seleccionados por el cliente
	 */
	@PostMapping(value = "/crearFactura")
	public String crearFactura(@RequestBody Factura request) {

			 Gson gson = new Gson();
			 final double IVA = 0.19;
			 double valorDomicilio = 10000;
			 
			 String productos = gson.toJson(request, Factura.class);
			 
			 double precioProducto = (double) (productos.substring("precio"));
			 
			if(precioProducto > 70000) {
				
				double precioIva = (precioProducto * IVA);
				precioProducto = precioProducto + precioIva + valorDomicilio;

			}
			else {
				if (precioProducto > 100000) {
				
					double precioIva = (precioProducto * IVA);
				   precioProducto = precioProducto + precioIva;
				   
				}
			}
			
			LocalDate dateIncial = LocalDate.now();
			 
		System.out.println(productos);
			 
		
		
		facturas.add(new Factura(request.getIdCliente(), request.getProductos(), request.getDescripcion(), request.getprecioProducto()));

		for (Factura factura : facturas) {
			System.out.println("Factura: " + factura.getIdCliente() + " " + factura.getProductos() + " "
					+ factura.getDescripcion());
		}

		return "Factura Creada";
	}
	
	/**
	 * editarFactura
	 * Método encargado de actualizar dependiendo de criterios de aceptación una factura registrada por un cliente  
	 * @author Javier Pinzon
	 * @param recibe un objeto lista con un json de los productos registrados en una factura
	 * @return Retorna una lista con los productos de una factura actualizada por el cliente
	 */
	
	@PostMapping(value = "/editarFactura")
	public String editarFactura(@RequestBody Factura request) {

			 Gson gson = new Gson();
			 
			 LocalDate dateEdicion = LocalDate.now();
			 
			 String productos = gson.toJson(request, Factura.class);
			 
		System.out.println(productos);
			 
		
		
		facturas.add(new Factura(request.getIdCliente(), request.getProductos(), request.getDescripcion(), request.getTotal()));

		for (Factura factura : facturas) {
			System.out.println("Factura: " + factura.getIdCliente() + " " + factura.getProductos() + " "
					+ factura.getDescripcion());
		}

		return "Factura Modificada con exito";
	}
	
	/**
	 * eliminarFactura
	 * Método encargado de eliminar dependiendo de criterios de aceptación una factura registrada por un cliente  
	 * @author Javier Pinzon
	 * @param recibe un objeto lista con un json de los productos disponibles
	 * @return Retorna una lista con los productos de una factura actualizada por el cliente
	 */
	
	@PostMapping(value = "/eliminarFactura")
	public String eliminarFactura(@RequestBody Factura request) {

			 Gson gson = new Gson();
			 
			 
			 String productos = gson.toJson(request, Factura.class);
			 
		System.out.println(productos);
			 
		
		
		facturas.add(new Factura(request.getIdCliente(), request.getProductos(), request.getDescripcion(), request.getTotal()));

		for (Factura factura : facturas) {
			System.out.println("Factura: " + factura.getIdCliente() + " " + factura.getProductos() + " "
					+ factura.getDescripcion());
		}

		return "Factura eliminada con exito";
	}

}
