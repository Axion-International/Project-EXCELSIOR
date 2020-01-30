package com.axion.service;

import com.axion.model.User;

public interface UserService {
	
	public User registerUser(User users);

	public User updateUser(User users);

	public User getUserByUsername(String username);

	public User authentication(User users);
}
