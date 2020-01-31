package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.UserDao;
import com.axion.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("From UserServiceIMPL: " + user);
		return userDao.save(user);
	}

	@Override
	public User updateUser(User users) {
		// TODO Auto-generated method stub
		return userDao.save(users);
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.findByUsername(username);
	}

	@Override
	public User authentication(User users) {
		User user = userDao.findByUsername(users.getUsername());
		if (user == null) {
			throw new RuntimeException("User does not exist!");
		}
		if (!user.getPassword().equals(users.getPassword())) {
			System.out.println(user.getPassword() + " " + users.getPassword());
			throw new RuntimeException("Wrong password. Try again");
		}
		return user;
	}

}
