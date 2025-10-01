package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	private ArrayList<Producto> listaDeProductos;
	
	public TiendaElectronica(ArrayList<Producto> listaDeProductos) {
		this.listaDeProductos = new ArrayList<>();
	}

	public void agregarProducto(Producto producto) {
		listaDeProductos.add(producto);
		System.out.println("Producto agregaddo: "+ producto.getnombreProducto());
	}
	public void mostrarProductos() {
		if (listaDeProductos.isEmpty()) { 
			System.out.println("No hay productos.");
		} else { 
			System.out.println("El inventario de productos es: ");
			for (Producto producto : listaDeProductos) {
				System.out.println(" - " + producto);
			}
		}
	}
	public Producto buscarProducto(String nombreProducto) {
		for (Producto producto : listaDeProductos) {
			if (producto.getnombreProducto().equalsIgnoreCase(nombreProducto)) {
				return producto;
			} return null;
		}
	
	public void venderProducto(String nombreProducto) {
		Producto producto = buscarProducto(nombreProducto);
		if (producto == null) {
			System.out.println("El producto no existe en la tienda.");
		} else if (producto.getcantidadDisponible()> 0) {
			producto.setcantidadDisponible(producto.getcantidadDisponible() -1);
			System.out.println("Venta realizada existosamente.");
	} else {
		System.out.println("El producto seleccionado está agotado.");
	}
}
}
