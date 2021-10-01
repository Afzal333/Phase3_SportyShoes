package com.sportyshoes.service;

import java.util.List;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.sportyshoes.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public void save(Product Product);

	public void deleteById(Long id);

	public void update(@Valid Product Product);

	public Product findById(Long id);	
	
}
