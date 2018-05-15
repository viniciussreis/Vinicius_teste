package com.teste.corridas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.corridas.model.Passageiro;
import com.teste.corridas.repository.Passageiros;

@Controller
public class PassageirosController {
	
	@Autowired
	private Passageiros passageiros;
	
	@GetMapping("/passageiros")
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("ListaPassageiros");
		modelAndView.addObject("passageiros", passageiros.findAll());
		modelAndView.addObject(new Passageiro());
		
		return modelAndView;	
		
	}

	@GetMapping("/adicionarPassageiro")
	public String criarForm(@ModelAttribute Passageiro passageiro) {
		return "AdicionarPassageiro";
	}
	
	@PostMapping("/passageiros")
	public String salvar(Passageiro passageiro) {
		this.passageiros.save(passageiro);
		return "redirect:/passageiros";
	}
}
