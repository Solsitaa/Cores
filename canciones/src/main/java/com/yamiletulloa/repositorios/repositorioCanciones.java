package com.yamiletulloa.repositorios;

import org.springframework.stereotype.Repository;
import com.yamiletulloa.modelos.cancion;
@Repository

public interface repositorioCanciones extends CrudRepertory<Canciones, Long> {
	
 List<canciones> findAll();

}
