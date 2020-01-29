package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.UserDao;
import com.axion.model.User;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public User registerEmployee(User users) {
		return userDao.save(users);
	}

	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

}