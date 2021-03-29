package com.example.TaskManager.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.services.TaskService;



@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	

	
	@GetMapping(value="/")
    public String showIndexPage() {   
		 return "index";
    }
	
	@GetMapping(value="/addtask")
    public String showTaskPage() {   

		return "taskform";
	}
	
	@GetMapping("/taskoptions")
	public String showOptions() {
		return"taskoptions";
	}
	
	@PostMapping("/addtask")
	public String addTask(ModelMap model, @RequestParam String name,@RequestParam String desc, @RequestParam Date sdate, @RequestParam Date edate,
			@RequestParam String email, @RequestParam String sev) {
		Task t = new Task();
		//t = taskService.GetUserById(id);
//		t.setId(id);
		t.setName(name);
		t.setDescription(desc);
		t.setStartDate(sdate);
		t.setEndDate(edate);
		t.setEmail(email);
		t.setSeverity(sev);
		model.addAttribute("task",t);
		taskService.UpdateTask(t);
		
		return"success";
	}
	
	@GetMapping("/viewtasks")
	public String showUsers(ModelMap model) {
		
		
//		logger.info("Getting all Users");
		Iterable<Task> task = taskService.GetAllTasks();
		
		//logger.info("Passing users to view");
	    model.addAttribute("task", task);    
        return "viewtasks";
    }
	
	@GetMapping("/search")
    public String searchTaskPage() {   

		return "search";
	}
	
	@PostMapping("/search")
	public String searchTasks(ModelMap model, @RequestParam int id) {
		Task t = taskService.GetUserById(id);
		List<Task> tl = new ArrayList<>();
		tl.add(t);
	    model.addAttribute("task", t);    
        return "edit";
    }
	
	@PostMapping("/update")
	public String updateTask(ModelMap model,@RequestParam int id, @RequestParam String name,@RequestParam String desc, @RequestParam Date sdate, @RequestParam Date edate,
			@RequestParam String email, @RequestParam String sev) {
		Task t = new Task();
		t = taskService.GetUserById(id);
		t.setId(id);
		t.setName(name);
		t.setDescription(desc);
		t.setStartDate(sdate);
		t.setEndDate(edate);
		t.setEmail(email);
		t.setSeverity(sev);
		model.addAttribute("task",t);
		taskService.UpdateTask(t);
		return "updatesuccess";
	}
	
	@GetMapping("/delete")
	public String deleteTask() {
		return "searchdelete";
	}

	@PostMapping("/delete")
	public String deletedTask(ModelMap model,@RequestParam int id) {
		Task t = new Task();
		t = taskService.GetUserById(id);
		taskService.DeleteTask(t.getId());
		return "deletesuccess";
		
		
	}
	

}
