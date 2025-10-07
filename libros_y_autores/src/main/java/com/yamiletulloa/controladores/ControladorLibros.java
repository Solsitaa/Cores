package com.yamiletulloa.controladores;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/libros")

public class ControladorLibros {
	private static HashMap<String, String> listaLibros = new HashMap<String, String>();
	
	public ControladorLibros() {
		listaLibros.put("Odisea", "Homero");	
		listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
		listaLibros.put("El Código Da Vinci", "Dan Brown");		
		listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
		listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
		listaLibros.put("El alquimista", "Paulo Coelho");	
	}
	
	@GetMapping("/")
	public String obtenerTodosLosLibros() {
		return "libros";
	}
	@GetMapping("/formulario")
	public String formularioLibro() {
		return "formularioLibros";
	}
	@PostMapping("/procesa/libro")
	public String agregarLibro(@RequestParam("titulo") String titulo,
							@RequestParam("autor") String autor,
							Model modelo) {
		listaLibros.put(titulo, autor);
		modelo.addAttribute("nombre", titulo);
		modelo.addAttribute("autor", autor);
		return "detalleLibro";
	}
	@GetMapping("/{nombre}")
	public String obtenerInformacionDeLibro(@PathVariable("nombre") String nombre, Model modelo) {
		if (listaLibros.containsKey(nombre)) {
			modelo.addAttribute("nombre", nombre);
			modelo.addAttribute("autor", listaLibros.get(nombre));
		} else {
			modelo.addAttribute("mensaje", "El libro no se encuentra en nuestra lista");
		}
		return "detalleLibro";
	}

	
}
