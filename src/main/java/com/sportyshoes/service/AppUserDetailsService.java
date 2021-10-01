package com.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sportyshoes.entity.AppUserDetails;
import com.sportyshoes.entity.User;
import com.sportyshoes.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {
//	
//	@Autowired
//	private UserRepository repository;
//	
	@Autowired
	private UserService service;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<User> users = service.findByLoginName(username);
		if(users.size()==1) {
			return new AppUserDetails(users.get(0));
		}else {
			throw new UsernameNotFoundException("Invalid Username");
		}
		
	}

}
