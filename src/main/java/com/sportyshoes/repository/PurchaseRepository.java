package com.sportyshoes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sportyshoes.entity.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
	
	@Query("select purchase"
			+ "	from Purchase purchase"
			+ "	join fetch purchase.products product"
			+ "	where"
			+ "	purchase.purchase_date = :date"
			+ "	and exists ("
			+ "	  select 1"
			+ "	  from purchase.products pp "
			+ "	  where pp.product_category.category_name = :categoryName"
			+ "	)") 
	Optional<List<Purchase>> findByDateAndCategory(String date, String categoryName);	
	
	
	

}
