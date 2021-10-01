package com.sportyshoes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.entity.Product;
import com.sportyshoes.entity.Purchase;
import com.sportyshoes.entity.User;
import com.sportyshoes.repository.ProductRepository;
import com.sportyshoes.repository.PurchaseRepository;

@Service
public class PurchaseServiceImpl implements PurchaseService{

	@Autowired
	PurchaseRepository repository; 

	@Override
	public List<Purchase> getAllPurchaseRecords() {
		return repository.findAll();
	}

	@Override
	public List<Purchase> findByDateAndCategory(String date, String category) {
		Optional<List<Purchase>> purchases =  repository.findByDateAndCategory(date, category);
		if(purchases!=null && purchases.isPresent())
			return purchases.get();
		else
			return new ArrayList<Purchase>();
	}	
}

