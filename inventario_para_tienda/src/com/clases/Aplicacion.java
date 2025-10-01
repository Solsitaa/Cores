package com.clases;

import com.clases.ProductoElectrodomestico;
import com.clases.TiendaElectronica;

public class Aplicacion {

	public static void main(String[] args) {
		TiendaElectronica tienda = new TiendaElectronica();
		
		Producto produc1 = new Producto("Notebook", 250000.0, 1);
		Producto produc2 = new Producto("Televisor", 800000.0, 3);
		Producto produc3 = new Producto("Lavadora", 300000.0, 2);
	
	tienda.addProducto(produc1);
	tienda.addProducto(produc2);
	tienda.addProducto(produc3);
	
	System.out.println("El inventario inicial es: " );
	tienda.mostrarProductos();
	
	System.out.println("Se está realizando la venta de los siguientes productos: ");
	tienda.venderProducto("Notebook");
	tienda.venderProducto("Televisor");
	tienda.venderProducto("Lavadora");
	
	System.out.println("El inventario final es: ");
	tienda.mostrarProductos();
	}
}

