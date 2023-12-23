package com.pavan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hi")
	public String sayHai() {
		return "<h1 style='color:green'>Hii from Spring Boot Initializr</h1>";  //   http://localhost:3333/hi
	}
}
