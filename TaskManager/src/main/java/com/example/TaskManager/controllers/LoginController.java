package com.example.TaskManager.controllers;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TaskManager.entities.User;
import com.example.TaskManager.services.UserService;




@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
    Logger logger = LoggerFactory.getLogger(LoginController.class);

//    @GetMapping("/")
//    public String showGreeting(ModelMap map) {
//        return "index";
//    }


        @GetMapping("/login")
	    public String showLogin(ModelMap map) {
	        return "login";
	    }

	    @PostMapping("/login")
	    public String submitLogin(@RequestParam("username") String username, @RequestParam("password") String password){
	    	logger.info("*****************Passing these parameters username " + username);
			logger.info("******************Passing these parameters username " + password);
			User u = userService.GetUserByName(username);
			logger.info("***************Passing these parameters username " + u.getUsername());
			logger.info("***************Passing these parameters username " + u.getPassword());
			boolean data = userService.authenticate(username, password, u);
			if (data) {
				return "success";
			} else {
				return "loginfail";
			}
	    }
	    
	    @GetMapping("/adduser")
	    public String addUser() {
	    	return "register";
	    }
	    
	    @PostMapping("/adduser")
	    public String addUsers(ModelMap model, @RequestParam String name, @RequestParam String email, @RequestParam String username, 
	    		@RequestParam String password) {
	    	User u = new User();
	    	u.setName(name);
	    	u.setEmail(email);
	    	u.setUsername(username);
	    	u.setPassword(password);
	    	model.addAttribute("user", u);
	    	userService.AddUser(u);
	    	return "usersuccess";
	    	
	    }
//	    
//		
//		@GetMapping("/users")
//		public String showUsers(ModelMap model) {
//			
//			
//			logger.info("Getting all Users");
//			Iterable<User> users = userService.GetAllUsers();
//			
//			logger.info("Passing users to view");
//		    model.addAttribute("users", users);    
//	        return "users";
//	    }

    
}
