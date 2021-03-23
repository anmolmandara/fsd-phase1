package com.example.Authentication.services;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Authentication.controllers.LoginController;
import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	 private UserRepository userRepository;
	
   Logger logger = LoggerFactory.getLogger(LoginController.class);

	

   public Iterable<User> GetAllUsers()
   {
       return userRepository.findAll();
   }


   public User GetUserByName(String username) {
		User found = userRepository.findByUsername(username);
		return found;
	}
   
 
   public boolean authenticate(String username, String password, User users) {	
		 if ( users != null && users.getPassword().equals(password)) {
	         return true;
	     }	
		return false;		
	}

}
