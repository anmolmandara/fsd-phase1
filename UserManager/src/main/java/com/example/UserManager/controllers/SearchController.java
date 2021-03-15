package com.example.UserManager.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.UserManager.entities.User;
import com.example.UserManager.services.UserService;

@Controller
public class SearchController {
	
@Autowired
private UserService userService;
	
   // Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchUsers(ModelMap model, @RequestParam int id) {
		
		
		//Iterable<User> users = userService.GetAllUsers();
		User u = userService.GetUserById(id);
		List<User> ul = new ArrayList<>();
		ul.add(u);
	    model.addAttribute("user", u);    
		
        return "users";
    }
	
//	@Controller
//	public class IndexController implements ErrorController{
//	    private final static String PATH = "/error";
//	    @Override
//	    @RequestMapping(PATH)
//	    @ResponseBody
//	    public String getErrorPath() {
//	        // TODO Auto-generated method stub
//	        return "No Mapping Found";
//	    }
//
//	}
}
	
