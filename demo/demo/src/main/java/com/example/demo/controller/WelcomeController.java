package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	private String message = "Welcome to Demo Application";
	
	@RequestMapping("/welcome")
	public String displayWelcomePage(ModelMap model) {
		model.addAttribute("welcome", "");
		return "welcome";
	}
	
	
	
}
