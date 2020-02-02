package com.axion.service;

import javax.servlet.http.HttpSession;

import com.axion.exception.AxionException;
import com.axion.model.User;

public interface UserService {
	
	public User registerUser(User user) throws AxionException;

	public User updateUser(User users);

	public User getUserByUsername(String username);

	public User authentication(User user, HttpSession session) throws AxionException;
	
	public User authenticatEmp(User user, HttpSession session) throws AxionException;
	
	public void userLogoff(HttpSession session);
}
