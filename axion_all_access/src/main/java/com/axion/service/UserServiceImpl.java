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
			throw new AxionException("User: " +user.getUsername()+ " does not exist!");
		}
		if (!userT.getPassword().equals(user.getPassword())) {
			throw new AxionException("Incorrect login credentials.");
		}

		return user;
		
	}

	@Override
	public User authenticatEmp(User user) throws AxionException {
		User userT = userDao.findByUsername(user.getUsername());
		
		if (userT == null) {
			throw new AxionException("User: " +user.getUsername()+ " does not exist!");
		}
		
		if(userT.getRole().getRoleId() != 3) {
			System.out.println(userT.getRole().getRoleId());
			throw new AxionException("User: " +userT+ " is not a registered employee");
		}

		if (!userT.getPassword().equals(user.getPassword())) {
			throw new AxionException("Incorrect login credentials.");
		}
		
		return user;
	}
	

	

}
