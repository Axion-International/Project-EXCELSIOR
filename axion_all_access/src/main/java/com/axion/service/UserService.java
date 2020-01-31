package com.axion.service;

import com.axion.exception.AxionException;
import com.axion.model.User;

public interface UserService {
	
	public User registerUser(User user);

	public User updateUser(User users);

	public User getUserByUsername(String username);

	public User authentication(User user) throws AxionException;
	

}
