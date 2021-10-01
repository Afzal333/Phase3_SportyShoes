package com.sportyshoes.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportyshoes.entity.AppUserDetails;
import com.sportyshoes.entity.Product;
import com.sportyshoes.entity.User;
import com.sportyshoes.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}	
	
	@GetMapping("customers")
	public String Customers(Model model) {
		model.addAttribute("Users", service.getAllUsers());
		return "users";
	}
	
	@PostMapping("search")
	public String editProductById(@RequestParam("search") String search, Model model) {
		List<User> users = service.findByName(search);
		model.addAttribute("Users", users);
		return "users";

	}
	
	@GetMapping("changePasswordShow")
	public String changePasswordShow(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = principal.toString();

		  
		if (principal instanceof AppUserDetails) {
		   username = ((AppUserDetails)principal).getUsername();
		}
		
		model.addAttribute("PrincipalUserName", username);
		return "changePassword";
	}
	
	@PostMapping("changePasswordSubmit")
	public String changePassword(@RequestParam("currentPassword") String currentPassword
								, @RequestParam("newPassword") String newPassword, Model model) {
	
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = principal.toString();		  
		if (principal instanceof AppUserDetails) {
			userName = ((AppUserDetails)principal).getUsername();
		}
		
		service.changePassword(userName, currentPassword, newPassword);
		
		return  "redirect:/logout";
 

	}

	
}

