package com.example.UserManager.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.UserManager.entities.User;
import com.example.UserManager.services.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
    Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping("/users")
	public String showUsers(ModelMap model) {
		
		
		logger.info("Getting all Users");
		Iterable<User> users = userService.GetAllUsers();
		
		logger.info("Passing users to view");
	    model.addAttribute("users", users);    
        return "users";
    }
	
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchUsers(ModelMap model, @RequestParam int id) {
		User u = userService.GetUserById(id);
		List<User> ul = new ArrayList<>();
		ul.add(u);
	    model.addAttribute("users", u);    
        return "edit";
    }
	
	@RequestMapping(value= "/update", method = RequestMethod.POST)
	public String updateUser(ModelMap model, @RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam String password) {
		User u = new User(); 
		u = userService.GetUserById(id);
		u.setEmail(email);
		u.setId(id);
		u.setName(name);
		u.setPassword(password);
		model.addAttribute("users",u);
		userService.UpdateUser(u);
		return "success";	
	}
	
	
}
