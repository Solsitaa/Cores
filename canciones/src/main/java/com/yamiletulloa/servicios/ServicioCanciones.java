package com.yamiletulloa.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yamiletulloa.canciones.modelos.cancion;
import com.yamiletulloa.canciones.repositorios.RepositorioLibros;
import com.yamiletulloa.modelos.Cancion;


@Service

public class ServicioCanciones {
	@Autowired
	
	private final RepositorioCanciones repositorioCanciones;
	public ServicioCanciones(RepositorioCanciones repositorioCanciones) {
		this.repositorioCanciones = repositorioCanciones;
	}
	public List<Cancion> obtenerTodos(){
		return this.repositorioCanciones.findAll();
	}
	 public Cancion obtenerUno(Long idCancion){
	        return this.repositorioCancioness.findById(idCancion).orElse(null);
	    }
	 public Cancion agregarUno(Cancion nuevaCancion) {
		 return this.repositorioCanciones.save(nuevaCancion);
	 }
	 public Cancion actualizarUno(Cancion cancion) {
		 return this.repositorioCanciones.save(cancion);
	 }
	 public void eliminarUno(Long idCancion) {
		 this.repositorioCanciones.deleteById(idCancion);
		 return "redirect:/cancion";
		 
	 }
	 //public void agregarUno(Cancion nuevaCancion) {
		// TODO Auto-generated method stub
		
	 }
	 
}
