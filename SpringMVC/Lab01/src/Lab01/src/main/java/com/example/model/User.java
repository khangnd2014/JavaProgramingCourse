package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class User {
	private String username;
	private String password;

	
	  public User(String username, String password) { super(); this.username =
	  username; this.password = password; }
	  
	  public User() { super(); }
	  
	  public String getUsername() { return username; }
	  
	  public void setUsername(String username) { this.username = username; }
	  
	  public String getPassword() { return password; }
	  
	  public void setPassword(String password) { this.password = password; }
	 

}
