package com.axion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axion.model.User;
import com.axion.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	@PostMapping("/employee")
	public User registerEmployee(@RequestBody User users) {
		return service.registerEmployee(users);
	}
	
	@GetMapping("/employee/{username}")
	public User getUserByUsername(@PathVariable("username") String username) {
		return service.findByUsername(username);
	}
	
	
}
