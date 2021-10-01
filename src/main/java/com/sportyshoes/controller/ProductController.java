package com.sportyshoes.controller;

import javax.validation.Valid;

import org.hibernate.annotations.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sportyshoes.entity.Product;
import com.sportyshoes.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}	
	
	@GetMapping
	public String Products(Model model) {
		model.addAttribute("Products", service.getAllProducts());
		return "products";
	}

	@GetMapping("add-new")
	public String showProductForm(Model model) {
		model.addAttribute("Product", new Product());
		return "new-product";
	}

	@PostMapping("save")
	public String addNewProduct(@Valid @ModelAttribute Product Product, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("Product", new Product());
			return "new-product";
		}

		service.save(Product);
		model.addAttribute("Products", service.getAllProducts());
		return "products";
	}

	@PostMapping("{id}/delete")
	public String delete(@PathVariable Long id, Model model) {
		service.deleteById(id);

		model.addAttribute("Products", service.getAllProducts());
		return "products";
	}

	@PostMapping("{id}")
	public String editProductById(@PathVariable Long id, Model model) {
		Product Product = service.findById(id);
		model.addAttribute("Product", Product);
		return "edit-product";

	}

	@PostMapping("{id}/update")
	public String update(@PathVariable Long id, @Valid @ModelAttribute Product Product,  BindingResult result,Model model) {

		if (result.hasErrors())
			return "edit-product";

		service.update(Product);

		model.addAttribute("Products", service.getAllProducts());

		return "products";
	}


}
