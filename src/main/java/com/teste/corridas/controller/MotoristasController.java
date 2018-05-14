package com.teste.corridas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.corridas.model.Motorista;
import com.teste.corridas.repository.Motoristas;

@Controller
public class MotoristasController {

	@Autowired
	private Motoristas motoristas;

	@GetMapping("/motoristas")
	public ModelAndView listar() {

		ModelAndView modelAndView = new ModelAndView("ListaMotoristas");
		modelAndView.addObject("motoristas", motoristas.findAll());
		modelAndView.addObject(new Motorista());

		return modelAndView;
	}

	@GetMapping("/adicionarMotorista")
	public String criarForm(@ModelAttribute Motorista motorista) {
		return "AdicionarMotorista";
	}

	@PostMapping("/motoristas")
	public String salvar(Motorista motorista) {
		this.motoristas.save(motorista);
		return "redirect:/motoristas";
	}

}
