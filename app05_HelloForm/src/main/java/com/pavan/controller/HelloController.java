package com.pavan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping(value="/helloform", method=RequestMethod.GET)  //   http://localhost:1234/helloform 
	public String getHelloPage() {
		return "hellopage";    //  it renders to hellopage.jsp
	}
	
	@RequestMapping(value="/wishpage", method=RequestMethod.POST)   //   /wishpage --> that we have provided in hellopage.jsp
	public String wish(@RequestParam String uname, ModelMap map) {  
		map.addAttribute("uname", uname);
		return "wish";        //    it renders to wish.jsp
	}
}
