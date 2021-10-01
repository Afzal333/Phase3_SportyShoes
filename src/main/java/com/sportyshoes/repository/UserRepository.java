package com.sportyshoes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.sportyshoes.entity.User;

import lombok.extern.apachecommons.CommonsLog;

public interface UserRepository extends JpaRepository<User, Long>{

    @Query("SELECT u FROM User u where user_name = :name") 
	Optional<List<User>> findByName(String name);
    
    @Query("SELECT u FROM User u where login_name = :loginName") 
   	Optional<List<User>> findByLoginName(String loginName);
    
    @Query("SELECT u FROM User u where u.login_name = :loginName and u.password= :password") 
   	Optional<List<User>> findByLoginNameAndPassword(String loginName, String password);

//    
//    @Transactional
//    @Modifying(clearAutomatically=true)
//    @Query("UPDATE User u set u.password = :newPassword where u.login_name = :userName and u.password = :currentPassword")
//	void changePassword(String userName, String currentPassword, String newPassword);
//    
	
}
