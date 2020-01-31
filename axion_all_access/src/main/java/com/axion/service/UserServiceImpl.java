package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.UserDao;
import com.axion.exception.AxionException;
import com.axion.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
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
	public User authentication(User user) throws AxionException {
		User userT = userDao.findByUsername(user.getUsername());
		
		if (userT == null) {
			throw new AxionException("User: " +userT+ " does not exist!");
		}
		if (!userT.getPassword().equals(user.getPassword())) {
			System.out.println(userT.getPassword() + " " + user.getPassword());
			throw new AxionException("Incorrect login credentials.");
		}

		return user;
		
	}
	

	

}
