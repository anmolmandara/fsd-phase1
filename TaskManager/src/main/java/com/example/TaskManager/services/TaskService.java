package com.example.TaskManager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.exceptions.UserNotFoundException;
import com.example.TaskManager.repositories.TaskRepository;
import java.util.Optional;


@Service
public class TaskService {
	
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Iterable<Task> GetAllTasks() {
	
		return taskRepository.findAll();
	}

	public Iterable<Task> GetTasksByUser(User user) {
		//TODO: what do we do if the user doesn't have any tasks or doesn't exist?
		
		return(taskRepository.findAllByUser(user));
	}
	
	public Task GetUserById(int id) {
    	Optional<Task> foundUser = taskRepository.findById(id);
    	//TODO: we need to decide how to handle a "Not Found" condition
    	if (!foundUser.isPresent()) {
    		throw new UserNotFoundException();
    	}
    	return(foundUser.get());
    }

	public void UpdateTask(Task tasktoUpdate) {
    	taskRepository.save(tasktoUpdate);
    }
	
	public void DeleteTask(int id) {
		taskRepository.deleteById(id);
	}
}
