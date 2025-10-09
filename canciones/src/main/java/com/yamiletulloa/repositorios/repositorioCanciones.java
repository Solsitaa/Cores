package com.yamiletulloa.repositorios;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.yamiletulloa.canciones.modelos.cancion;
@Repository

public interface repositorioCanciones extends CrudRepository<Canciones, Long> {
	
 List<canciones> findAll();
 Libro save(Cancion nuevaCancion);
 void deleteById(Long idCancion);

}
