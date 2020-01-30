package com.axion.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axion.model.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@GetMapping("/user")
	public User registerUser(@RequestBody User users) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@PutMapping("user")
	public User updateUser(@RequestBody User users) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("user/{username}")
	public User getUserByUsername(@PathVariable String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("/user/login")
	public User authentication(@RequestBody User users) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
