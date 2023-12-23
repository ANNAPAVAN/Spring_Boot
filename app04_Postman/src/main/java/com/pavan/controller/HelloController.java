package com.pavan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello() {
		return "<h1 style='color:red'>Hello User !!!!!!!!</h1>";
	}
	
//	@RequestMapping(value="/welcome", method=RequestMethod.POST)
//	public String sayWelcome() {
//		return "<h1 style='color:blue'>Welcome User !!!!!!!!</h1>";
//	}
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String sayWelcome() {
		return "<h1 style='color:blue'>Welcome User !!!!!!!!</h1>";
	}
}
