package com.teste.corridas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.corridas.model.Corrida;
import com.teste.corridas.repository.Corridas;
import com.teste.corridas.repository.Motoristas;

@Controller
public class CorridasController {

	@Autowired
	private Corridas corridas;
	
	@Autowired
	private Motoristas motoristas;
	
	@GetMapping("/corridas")
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("ListaCorridas");
		modelAndView.addObject("corridas", corridas.findAll());
		modelAndView.addObject(new Corrida());
		modelAndView.addObject("motoristas", motoristas.findAll());
		return modelAndView;
	}
	
/*	@GetMapping()
	public String criarForm(@ModelAttribute Motorista motorista) {
		return "redirect:/corridas";
	}*/
}
