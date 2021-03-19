package com.example.UserFeedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.services.FeedbackService;

@Controller
public class UserController {

	@Autowired
	private FeedbackService feedbackServices;
	
	
	@GetMapping("/addfeedback")
	public String addFeedback() {
		return "form";
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/success")
	public String success() {
		return "success";
	}
	
	
}
