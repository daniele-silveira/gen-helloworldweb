package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello Generation!!";
	}
	
	@GetMapping ("/bsm")
	public String bsm() {
		return "Comunicação, Proatividade, Orientação ao Detalhe e Trabalho em Equipe.";
	}
	
	@GetMapping ("/missao")
	public String missao() {
		return "A Generation promove a mobilidade econômica através do emprego, preparando, apoiando e empregando as pessoas em carreiras transformadoras que, de outra forma, seriam inacessíveis.";
	}

}
