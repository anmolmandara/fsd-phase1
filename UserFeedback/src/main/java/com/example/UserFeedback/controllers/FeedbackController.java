package com.example.UserFeedback.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.services.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
     
	
	@GetMapping("/feedback")
	public @ResponseBody Iterable<Feedback> getAllFeedbacks() {
        // This returns a JSON or XML with the Feedbacks
        return feedbackService.GetAllFeedback();
    }
	
	@PostMapping(path="/feedback", consumes= {MediaType.APPLICATION_JSON_VALUE})
	public Feedback addfeedback(@RequestBody Feedback fb) {
		Feedback f = new Feedback(fb.getComments(),fb.getRating(),fb.getUser());
		feedbackService.UpdateUser(f);
		return f;
	}
	
	@PostMapping("/addfeedback")
	public void updateUser(HttpServletResponse response, @RequestParam String comments, @RequestParam int rating, @RequestParam String user) throws IOException {
		Feedback f = new Feedback(); 
		f.setComments(comments);
		f.setRating(rating);
		f.setUser(user);
		feedbackService.UpdateUser(f);
		response.sendRedirect("/success");
	}
	
}
