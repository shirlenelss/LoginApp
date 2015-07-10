package org.thisApp.service;

import java.util.HashMap;

import org.thisApp.dto.User;


public class LoginService {

	HashMap<String,String> users = new HashMap<String,String>();
	
	public LoginService() {
		users.put("1", "Tricia");
		users.put("2", "Dora");
		users.put("3", "Shirlene");		
		
	}
	
	public boolean authenticatePassword(String userID, String password){
		if (password.trim() == "" || password == null) {
			return false;
		} else {
			return true;
		}
	}
	 
	public User getUserDetails(String userID) {
		User user = new User();
		user.setUsername(users.get(userID));
		user.setUserID(userID);
		return user;
	}

}
