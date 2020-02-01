package com.axion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axion.model.Location;
import com.axion.model.PromotionRequest;
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
	
	@GetMapping("/employee/login")
	public User authentication(@RequestBody User users) {
		return service.authenication(users);
	}
	
	//adding location
	@PostMapping("employee/location")
	public Location addCity(@RequestBody Location location) {
		// TODO Auto-generated method stub
		return service.addCity(location);
	}
	
	@GetMapping("employee/promotion")
	public List<PromotionRequest> getAllPromotionRequests() {
		return service.getAllPromotionRequests();
	}
	
	@PutMapping("employee/promotion")
	public void updatePromotionRequest(@RequestBody PromotionRequest promotionRequest) {
		// TODO Auto-generated method stub
		service.updatePromotionRequest(promotionRequest);
	}
	
}
