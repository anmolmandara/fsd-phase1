package com.example.SpringSecurity.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringSecurity.entities.User;



public interface UserRepository extends CrudRepository<User, Integer> {

	public Optional<User> findByUsername(String username);
}