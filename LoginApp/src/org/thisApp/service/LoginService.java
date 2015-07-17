package org.thisApp.service;

import java.util.HashMap;

import org.thisApp.dto.User;


public class LoginService {

	HashMap<String,String> usersList = new HashMap<String,String>();
	
	public LoginService() {
		usersList.put("1", "Tricia");
		usersList.put("2", "Dora");
		usersList.put("3", "Shirlene");		
		usersList.put("4", "Queennie");
		usersList.put("5", "Eugene");		
		
	}
	
	public boolean authenticatePassword(String userID, String password){
		if (password.trim() == "" || password == null) {
			return false;
		} 
		return true;		
	}
	 
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserName(usersList.get(userId));
		user.setUserID(userId);
		return user;
	}

}
