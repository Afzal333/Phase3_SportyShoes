package com.sportyshoes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Data;


@Entity
public class User {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int user_id;
	  
	  private String login_name;
	  private String password;	  
	  private String user_name;
	  private String user_email;
	  private String contact_number;
	  
	  @OneToOne
	  @JoinColumn(name="usertype_id")
	  private UserType user_type;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public UserType getUser_type() {
		return user_type;
	}

	public void setUser_type(UserType user_type) {
		this.user_type = user_type;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", login_name=" + login_name + ", password=" + password + ", user_name="
				+ user_name + ", user_email=" + user_email + ", contact_number=" + contact_number + ", user_type="
				+ user_type + "]";
	}	 
	
	
	  

}
