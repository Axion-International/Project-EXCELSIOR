package com.axion.service;

import com.axion.model.User;

public interface EmployeeService {
	public User registerEmployee(User users);
	public User findByUsername(String username);
	
}
