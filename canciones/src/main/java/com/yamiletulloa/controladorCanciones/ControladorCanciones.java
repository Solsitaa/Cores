package com.yamiletulloa.controladorCanciones;

import java.util.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller

public class ControladorCanciones {
	@Autowired
	private final ServicioCancion servicioCancion;
	public ControladorCanciones(ServicioCancion servicioCancion) {
		this.servicioCancion = servicioCancion;
	}
	
	@GetMapping("/canciones")
	public String desplegarCanciones() {
		return "canciones.jsp"
	}
	@GetMapping("/canciones/detalle/{idCancion}")
	public String desplegarDetalleCancion(@PathVariable Long idCancion,
											Model modelo) {
		Cancion cancion = this.servicioCancion.obtenerUno(idCancion);
		if(cancion == null) {
			return "La canción no se encuentra en la base de datos";
		} 
		modelo.addAttribute("cancion", cancion);
		return "detalleCancion.jsp"
	}
	

}
