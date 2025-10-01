package com.clases;

public class ProductoElectrodomestico {
	private String nombreProducto;
	private double precio;
	private int cantidadDisponible;
	
	
	public ProductoElectrodomestico(String nombrePruducto, double precio, int cantidadDisponible) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
	public ProductoElectrodomestico(String nombreProducto, double precio) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}
	public String getNombre() {
		return nombreProducto;
	}
	public void setNombre(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getcantidadDisponible() {
		return cantidadDisponible;
	}
	public void setcantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	public void despliegaInformacion() {
		System.out.println("Producto: " + this.nombreProducto);
		System.out.println("El preicio es: $" + this.precio);
		System.out.println("La cantidad de productos son: " + this.cantidadDisponible);
	}
}
