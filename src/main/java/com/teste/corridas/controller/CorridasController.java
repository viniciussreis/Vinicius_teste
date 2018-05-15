package com.teste.corridas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.corridas.model.Corrida;
import com.teste.corridas.repository.Corridas;
import com.teste.corridas.repository.Motoristas;
import com.teste.corridas.repository.Passageiros;

@Controller
@RequestMapping("/corridas")
public class CorridasController {

	@Autowired
	private Corridas corridas;

	@Autowired
	private Motoristas motoristas;

	@Autowired
	private Passageiros passageiros;

	@GetMapping
	public ModelAndView listar() {

		ModelAndView modelAndView = new ModelAndView("ListaCorridas");
		modelAndView.addObject("corridas", corridas.findAll());
		modelAndView.addObject("corrida", new Corrida());
		modelAndView.addObject("motoristas", motoristas.findAll());
		modelAndView.addObject("passageiros", passageiros.findAll());
		return modelAndView;
	}

	@PostMapping(params = "form")
	public String salvar(Corrida corrida) {
		this.corridas.save(corrida);
		return "redirect:/corridas";
	}

}
