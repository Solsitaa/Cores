package com.yamiletulloa.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yamiletulloa.canciones.modelos.cancion;
import com.yamiletulloa.repositorios.RepositorioLibros;


@Service

public class ServicioCanciones {
	@Autowired
	
	private final RepositorioCanciones repositorioCanciones;
	public ServicioCanciones(RepositorioCanciones repositorioCanciones) {
		this.repositorioCanciones= repositorioCanciones;
	}
	public List<Cancion> obtenerTodos(){
		return this.repositorioCanciones.findAll();
	}
	 public Cancion obtenerUno(Long idCancion){
	        return this.repositorioCancioness.findById(idCancion).orElse(null);
	    }

}
