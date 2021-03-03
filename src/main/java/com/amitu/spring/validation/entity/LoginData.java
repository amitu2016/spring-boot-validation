package com.amitu.spring.validation.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {
  
	@NotBlank(message = "User Name Can not be empty")
	@Size(min = 3, max = 12,  message = "User name should be between 3 - 12 characters")
	private String userName;
	
	
	private String email;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	
	
}
