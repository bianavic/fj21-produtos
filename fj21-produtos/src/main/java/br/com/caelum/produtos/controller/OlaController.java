package br.com.caelum.produtos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
	
	@GetMapping("/ola")
	public String dizOla() {
		return "Ola, Mundo Maravilhoso do Spring Boot";
	}

}
