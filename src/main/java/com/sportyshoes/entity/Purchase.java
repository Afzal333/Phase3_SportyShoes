package com.sportyshoes.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Purchase {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long purchase_id;
	  
	  @NotBlank(message = "Product Name is a mandatory field")
	  private String purchase_date;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="user_id")
	  private User user;
	  
	  private float price;
	  
	  @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, mappedBy = "purchases")
	  private List<Product> products;
	   

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public long getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(long purchase_id) {
		this.purchase_id = purchase_id;
	}

	public String getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Purchase [purchase_id=" + purchase_id + ", purchase_date=" + purchase_date + ", user=" + user
				+ ", price=" + price + ", products=" + products + "]";
	}

	
	
	  

}
