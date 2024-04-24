package com.laksh.ThymeLeafDemo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="userlogin")
public class User {

	@Id
	@Column(name="username")
	String username;
	@Column(name="userpass")
	String password;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	
	public String toString(){
		return ("Userid:"+this.username+" , "+ "UserPassword: "+this.password);
	}
	

}
