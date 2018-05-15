package com.teste.corridas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.corridas.model.Corrida;
import com.teste.corridas.repository.Corridas;
import com.teste.corridas.repository.Motoristas;
import com.teste.corridas.repository.Passageiros;

@Controller
public class CorridasController {

	@Autowired
	private Corridas corridas;
	
	@Autowired
	private Motoristas motoristas;
	
	@Autowired
	private Passageiros passageiros;
	
	@GetMapping("/corridas")
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("ListaCorridas");
		modelAndView.addObject("corridas", corridas.findAll());
		modelAndView.addObject(new Corrida());
		modelAndView.addObject("motoristas", motoristas.findAll());
		modelAndView.addObject("passageiros", passageiros.findAll());
		return modelAndView;
	}
	
	@PostMapping("/corridas")
	public String salvar(Corrida convidado) {
	this.corridas.save(convidado);
	return "redirect:/corridas";
	}

}
