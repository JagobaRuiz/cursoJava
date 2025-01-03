package com.amazonia.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazonia.entidades.Usuario;
import com.amazonia.entidades.UsuarioRegistro;
import com.amazonia.servicios.AnonimoService;

@Controller
public class IndexController {
	
	@Autowired
	private AnonimoService anonimoService;
	
	@GetMapping("/")
	public String index(Model modelo) {
		modelo.addAttribute("productos", anonimoService.listarProductos());
		return "index";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/registro")
	public String registro(Usuario usuario) {
		return "registro";
	}

	@PostMapping("/registro")
	public String registroPost(@Validated(UsuarioRegistro.class) Usuario usuario, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "registro";
		}

		anonimoService.registrarUsuario(usuario);

		return "redirect:/login";
	}

	
	@GetMapping("/detalle")
	public String detallePorId(Long id, Model modelo) {
		modelo.addAttribute("producto", anonimoService.detalleProducto(id));
		return "detalle";
	}
	
	@GetMapping("/detalle/{url}")
	public String detallePorUrl(@PathVariable String url, Model modelo) {
		modelo.addAttribute("producto", anonimoService.detalleProducto(url));
		return "detalle";
	}
}