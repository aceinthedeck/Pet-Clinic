package com.aceinthedeck.petClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aceinthedeck.petClinic.data.services.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}


	@RequestMapping("/vets")
	public String Index(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		
		return "vets/index";
	}
}