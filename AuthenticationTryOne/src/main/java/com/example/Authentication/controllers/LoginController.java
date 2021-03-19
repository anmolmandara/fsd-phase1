package com.example.Authentication.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.Authentication.services.UserService;
import com.example.Authentication.entities.User;



@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	Logger logger = LoggerFactory.getLogger(LoginController.class);

	

    @GetMapping("/")
    public String showGreeting(ModelMap map) {
        return "index";
    }


    @GetMapping("/login")
    public String showLogin(ModelMap map) {
        return "login";
    }

    @PostMapping("/login")
    public String submitLogin(@RequestParam String username, @RequestParam String password){
    	logger.info("Passing these parameters username " + username);
		logger.info("Passing these parameters username " + password);
		User u = userService.GetUserByName(username);
		logger.info("Passing these parameters username " + u.getUsername());
		logger.info("Passing these parameters username " + u.getPassword());
    	
		boolean data = userService.authenticate(username, password, u);

		if (data) {
			return "success";
		} else {
			return "loginfail";
		}

    }
}
