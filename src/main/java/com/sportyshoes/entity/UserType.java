package com.sportyshoes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;


@Entity
public class UserType {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int usertype_id;
	  
	  @NotBlank(message = "UserType name is a mandatory field")
	  String usertype_name;

	public int getUsertype_id() {
		return usertype_id;
	}

	public void setUsertype_id(int usertype_id) {
		this.usertype_id = usertype_id;
	}

	public String getUsertype_name() {
		return usertype_name;
	}

	public void setUsertype_name(String usertype_name) {
		this.usertype_name = usertype_name;
	}
	  
	  
}