package com.clases;

import com.clases.ProductoElectrodomestico;

public class Televisor extends ProductoElectrodomestico{
	private double tamañoPantalla;
	private double resolucion;
	
	public Televisor(String nombreProducto, double precio, int cantidadDisponible,double tamañoPantalla, double resolucion) {
		super(nombreProducto, precio, cantidadDisponible);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}
	//public double gettamañoPantalla() {
	//	return tamañoPantalla;
	//}
	//public void settamañoPantalla(double tamañoPantalla) {
	//	this.tamañoPantalla = tamañoPantalla;
	//}
	//public double getresolucion() {
	//	return resolucion;
	//}
	//public double setresolucion(double resolucion) {
	//	this.resolucion = resolucion;
	//}
	public void despliegaInformacionTelevisor() {
		super.despliegaInformacion();
		System.out.println("El tamaño de la pantalla es: " + this.tamañoPantalla);
		System.out.println("La resolución del televisor es: " + this.resolucion);
	}
	@Override
	public void despliegaInformacion() {
		System.out.println("Actualizando la información");
		this.despliegaInformacionTelevisor();
		
	}
}
