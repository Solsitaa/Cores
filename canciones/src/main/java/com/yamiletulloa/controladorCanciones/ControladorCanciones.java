package com.yamiletulloa.controladorCanciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.yamiletulloa.modelos.Cancion;
import com.yamiletulloa.servicios.ServicioCanciones;

@Controller

public class ControladorCanciones {
	@Autowired
	private final ServicioCanciones servicioCanciones;
	
	public ControladorCanciones(ServicioCanciones servicioCanciones) {
		this.servicioCanciones = servicioCanciones;
	}
	
	@GetMapping("/canciones")
	public String desplegarCanciones(Model modelo ) {
		List<Cancion> listaCanciones = this.servicioCanciones.obtenerTodos();
		modelo.addAttribute("listaCanciones", listaCanciones);
		return "canciones.jsp";
	}
	
	@GetMapping("/formulario/cancion")
	public String formularioCancion(@ModelAttribute("nuevaCancion") Cancion nuevaCancion) {
		return "formularioCancion";
	}
	@GetMapping("/canciones/detalle/{idCancion}")
	public String desplegarDetalleCancion(@PathVariable Long idCancion,
											Model modelo) {
		Cancion cancion = this.servicioCanciones.obtenerUno(idCancion);
		if(cancion == null) {
			return "La canción no se encuentra en la base de datos";
		} 
		modelo.addAttribute("cancion", cancion);
		return "detalleCancion.jsp";
	}
	
	@GetMapping("/formulario/actualizar/cancion/{idCancion}")
	public String formularioEditarCancion(@PathVariable Long idCancion,
											Model modelo) {
		Cancion cancion = this.servicioCanciones.obtenerUno(idCancion);
		modelo.addAttribute("cancion", cancion);
		return "formularioEditarCancion";
	}
	@PostMapping("/agregar/cancion")
	public String procesaAgregarCancion(@Validated @ModelAttribute("nuevaCancion") Cancion nuevaCancion,
									BindingResult validaciones) {
		if(validaciones.hasErrors()) {
			return "formularioCanciones";
		}
		this.servicioCanciones.agregarUno(nuevaCancion);
		return "redirect:/cancion";
	}
	@DeleteMapping("/eliminar/cancion/{idCancion}")
	public String eliminarCancion(@PathVariable Long idCancion) {
		this.servicioCanciones.eliminarUno(idCancion);
		return "redirect:/cancion";
	}
	@PutMapping("/editar/cancion/{idCancion}")
	public String actualizarCancion(@Validated @ModelAttribute("cancion") Cancion cancion,
									BindingResult validaciones,
									@PathVariable Long idCancion) {
		if(validaciones.hasErrors()) {
			return "formularioEditarCancion";
		}
		cancion.setId(idCancion);
		this.servicioCanciones.actualizarUno(cancion);
		return "redirect:/detalle/cancion/" + idCancion;
	}
	

}
