package com.clases;

import com.clases.ProductoElectrodomestico;

public class ComputadoraPortatil extends ProductoElectrodomestico{
	private String marca = marca;
	private int memoriaRAM = memoriaRam;
	private int numeroSerie = numeroSerie;
	
	public ComputadoraPortatil(String nombreProducto, double precio, int cantidadDisponible, String marca, int memoriaRAM, int numeroSerie) {
	super(nombreProducto, precio, cantidadDisponible);
	this.marca = marca;
	this.memoriaRAM = memoriaRAM;
	this.numeroSerie = numeroSerie;
	}
	public void despliegaInformacionComputadora() {
		super.despliegaInformacion();
		System.out.println("La marca es: " + this.marca);
		System.out.println("La memoria RAM es de: " + this.memoriaRAM + "GB");
		System.out.println("El numero de serie es: " + this.numeroSerie);
	}
	@Override
	public void despliegaInformacion() {
		System.out.println("La información sobre su computadora portátil es: ");
		this.despliegaInformacionComputadora();
	}
}
