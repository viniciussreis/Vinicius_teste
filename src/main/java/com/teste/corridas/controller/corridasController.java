package com.teste.corridas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class corridasController {

	@GetMapping("/clientes")
	public String listar() {
		return "ListaClientes";
	}
	
}
