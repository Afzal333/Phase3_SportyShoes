package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.entity.Purchase;
import com.sportyshoes.entity.User;

public interface PurchaseService {

	List<Purchase> getAllPurchaseRecords();

	List<Purchase> findByDateAndCategory(String date, String category);
		

}
