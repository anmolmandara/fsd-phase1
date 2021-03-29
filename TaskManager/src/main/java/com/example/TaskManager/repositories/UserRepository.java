package com.example.TaskManager.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.TaskManager.entities.User;



@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByUsername(String username);
}