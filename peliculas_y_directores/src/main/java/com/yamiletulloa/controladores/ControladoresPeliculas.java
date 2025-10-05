package com.yamiletulloa.controladores;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/peliculas")
public class ControladoresPeliculas {
	
	//@GetMapping("/inicio2")
	//public String inicio() {
		//return "index.jsp";
	

	private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();
	public ControladoresPeliculas() {
		listaPeliculas.put("Winnie the Pooh", "Don Hall");	
		listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
		listaPeliculas.put("Tarzán", "Kevin Lima");		
		listaPeliculas.put("Mulán", "Barry Cook");
		listaPeliculas.put("Oliver", "Kevin Lima");	
		listaPeliculas.put("Big Hero 6", "Don Hall");
	}
	
		@GetMapping()
			public String obtenerTodasLasPeliculas() {
			return listaPeliculas.toString() + " Son las peliculas disponibles";
		}
		
		@GetMapping("/{nombre}")
			public String obtenerPeliculasPorNombre(@PathVariable("nombre") String nombre) {
			if(listaPeliculas.containsKey(nombre)) {
				return "La peliculas" + nombre + "fue dirigida por: " + listaPeliculas.get(nombre);
			} else {
				return "La pelicula no fue encontrada";
			}
		}
		@GetMapping("/director/{nombre}")
		public String obtenerPeliculasPorDirector(@PathVariable("nombre") String nombre) {
			String peliculasDelDirector = "";
		    boolean encontrado = false;
		    
		    // Recorrer el HashMap buscando películas de ese director
		    for (String pelicula : listaPeliculas.keySet()) {
		        String director = listaPeliculas.get(pelicula);
		        
		        if (director.equals(nombre)) {
		            peliculasDelDirector += pelicula + ", ";
		            encontrado = true;
		        }
		    }
		    
		    // Verificar si se encontraron películas
		    if (encontrado) {
		        // Eliminar la última coma y espacio
		        peliculasDelDirector = peliculasDelDirector.substring(0, peliculasDelDirector.length() - 2);
		        return "Películas dirigidas por " + nombre + ": " + peliculasDelDirector;
		    } else {
		        return "No contamos con películas con ese director en nuestra lista.";
		    }
		
		}
		
	}
	

