package com.proyecto.spring.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyecto.spring.models.entity.Usuarios;
import com.proyecto.spring.models.service.IUsuariosService;

@Controller
public class UsuariosController {
	@Autowired
	private IUsuariosService iususer;
@GetMapping("/crearusuario")
public String registro(Model model) {
	model.addAttribute("usuario", new Usuarios());
	

	
return "registro";	
}
@PostMapping("/guardarusuario")
public String guardar(Usuarios usuarios) {
	iususer.guardarUsuarioCliente(usuarios);
	return "redirect:/crearusuario";
}

}
