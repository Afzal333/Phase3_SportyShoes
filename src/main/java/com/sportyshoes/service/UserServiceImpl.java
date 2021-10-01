package com.sportyshoes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.entity.Product;
import com.sportyshoes.entity.User;
import com.sportyshoes.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public void save(User User) {
		repository.save(User);
	}

	@Override
	public List<User> findByName(String name) {
		Optional<List<User>> users =  repository.findByName(name);
		if(users!=null && users.isPresent())
			return users.get();
		else
			return new ArrayList<User>();
	}
	
	@Override
	public List<User> findByLoginName(String loginName) {
		Optional<List<User>> users =  repository.findByLoginName(loginName);
		if(users!=null && users.isPresent())
			return users.get();
		else
			return new ArrayList<User>();
	}

	@Override
	public void changePassword(String loginName, String currentPassword, String newPassword) {	
		Optional<List<User>> users =  repository.findByLoginNameAndPassword(loginName, currentPassword);
		if(users!=null && users.isPresent() && !users.get().isEmpty()) {
			User user = users.get().get(0);
			user.setPassword(newPassword);
		    repository.save(user);
		}
	}
	

}
