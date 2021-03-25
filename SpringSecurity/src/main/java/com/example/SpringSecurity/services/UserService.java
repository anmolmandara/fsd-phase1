//package com.example.SpringSecurity.services;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.SpringSecurity.entities.User;
//import com.example.SpringSecurity.repositories.UserRepository;
//
//
//@Service
//public class UserService {
//	
//	@Autowired
//	 private UserRepository userRepository;
//
//
//	
//
//	/*
//	 * public Iterable<User> GetAllUsers() { return userRepository.findAll(); }
//	 */
//
//
//   public User GetUserByName(String username) throws RuntimeException {
//		Optional<User> found = userRepository.findByUsername(username);
//		if(found.isEmpty())
//			throw new RuntimeException();
//		return found.get();
//	}
//   
// 
//   public boolean authenticate(String username, String password, User users) {	
//		 if ( users != null && users.getPassword().equals(password)) {
//	         return true;
//	     }	
//		return false;		
//	}
//   
////   public String auth() {
////	   User u = 
////   }
//
//}
