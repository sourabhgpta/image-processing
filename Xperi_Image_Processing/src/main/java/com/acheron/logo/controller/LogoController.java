package com.acheron.logo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/images")
public class LogoController {
	
	@GetMapping("/test")
	public String testMapping() {
		return "Application is working";
	}
	
	

}
