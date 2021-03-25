//package com.example.SpringSecurity.controllers;
//
//import org.springframework.stereotype.Controller;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.example.SpringSecurity.entities.User;
//import com.example.SpringSecurity.services.UserService;
//
//
//@Controller
//public class LoginController {
//	
//	@Autowired
//	private UserService userService;
//		
//    Logger logger = LoggerFactory.getLogger(LoginController.class);
//
//
//	
//	 @RequestMapping(value = "/login", method = RequestMethod.GET)
//	 public String showLoginPage() {
//		 return "login";
//	 }
//	 
//	 @RequestMapping(value = "/login", method = RequestMethod.POST)
//	    public String loginPage(@RequestParam(value = "error", required = false) String error, 
//	                            @RequestParam(value = "logout", required = false) String logout,@RequestParam("username") String username, @RequestParam("password") String password,
//	                            Model model) {
////		 
//////		 User u = userService.GetUserByName(username);
//			logger.info("*************************************Passing these parameters username: " + username);
//			logger.info("*************************************Passing these parameters password: " + password);
//////			boolean data = userService.authenticate(username, password, u);
//////			if (data) {
//////				return "loginsuccess";
//////			} else {
//////				return "loginfailure";
////			}
//	       String errorMessge = null;
//	        if(error != null) {
//	            errorMessge = "Username or Password is incorrect !!";
//	        }
//	        if(logout != null) {
//	            errorMessge = "You have been successfully logged out !!";
//	        }
//	        model.addAttribute("errorMessge", errorMessge);
//	        return "login";
//	    }
//	  
//	    @RequestMapping(value="/logout", method = RequestMethod.GET)
//	    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//	        if (auth != null){    
//	            new SecurityContextLogoutHandler().logout(request, response, auth);
//	        }
//	        return "redirect:/login?logout=true";
//	    }
//	
//}
