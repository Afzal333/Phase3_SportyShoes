package com.sportyshoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.sportyshoes.service.ProductService;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}	
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}	
	
	@GetMapping("/logout")
	public String logoutPage() {
		return "login";
	}	
	
}
