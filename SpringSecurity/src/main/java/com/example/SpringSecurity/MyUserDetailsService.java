package com.example.SpringSecurity;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SpringSecurity.entities.User;
import com.example.SpringSecurity.repositories.UserRepository;




	@Service
	public class MyUserDetailsService implements UserDetailsService {

	    @Autowired
	    UserRepository userRepository;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Optional<User> user = userRepository.findByUsername(username);

	        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));

	        return user.map(UserDetailsssssssss::new).get();
	    }
	}


