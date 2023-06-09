package com.example.user.service.services;

import java.util.List;

import com.example.user.service.entities.User;

public interface UserService {

	//user operations
	
	//create
	User saveUser(User user);
	
	//get all users
	List<User> getAllUser();
	
	//get single user of given userId
	User getUser(String userId);
	
}
