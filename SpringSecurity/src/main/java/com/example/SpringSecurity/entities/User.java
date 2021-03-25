package com.example.SpringSecurity.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manageusers")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ID;

    private String password;
    
    private String username;
    
    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private String role;
    
    public String getUsername() {
    	return username;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return ID;
    }

    public void setId(Integer id) {
        this.ID = id;
    }

   
    
    @Override
    public String toString() {
    	return (ID.toString() + " " +role+ " " + password+" "+username);
    }
    
}