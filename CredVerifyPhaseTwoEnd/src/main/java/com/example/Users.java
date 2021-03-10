package com.example;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="accounts")

public class Users {

		@Id
		@Column(name="ID")
		private long ID;
		@Column (name="name")
		private String name;
		@Column (name="email")
		private String email;
		@Column (name="username")
		private String username;
		@Column (name="password")
		private String password;
		@Column (name="date_added")
		private Date dateAdded;

		public Users() {

		}

		public Users(long id, String name, String email,String username,String password, Date dateAdded) {
			this.ID = id;
			this.name = name;
			this.email = email;
			this.username = username;
			this.password = password;
			this.dateAdded = dateAdded;
		}

		public long getID() {
			return ID;
		}

		public void setID(long iD) {
			ID = iD;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

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

		public Date getDateAdded() {
			return dateAdded;
		}

		public void setDateAdded(Date dateAdded) {
			this.dateAdded = dateAdded;
		}

		
	}



