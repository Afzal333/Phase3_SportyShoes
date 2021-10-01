package com.sportyshoes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportyshoes.entity.Product;
import com.sportyshoes.entity.Purchase;
import com.sportyshoes.entity.User;
import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.PurchaseService;

@Controller
@RequestMapping("purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseService service;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}	
	
	@GetMapping("purchaseReport")
	public String getAllrecords(Model model) {
		model.addAttribute("PurchaseRecords", service.getAllPurchaseRecords());
		return "purchase_report";
	}

	@PostMapping("search")
	public String searchRecords(@RequestParam("purchasedate") String purchasedate, @RequestParam("category") String category, Model model) {
		List<Purchase> PurchaseRecords = service.findByDateAndCategory(purchasedate, category);
		model.addAttribute("PurchaseRecords", PurchaseRecords);
		return "purchase_report";

	}

	


}
