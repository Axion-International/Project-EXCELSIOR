package com.axion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axion.exception.AxionException;
import com.axion.model.Location;
import com.axion.model.PromotionRequest;
import com.axion.model.User;
import com.axion.service.EmployeeService;
import com.axion.service.ReferenceService;

@RestController
@CrossOrigin(origins = "http://axionallaccesswebv1.1.s3-website.us-east-2.amazonaws.com:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	@Autowired
	private ReferenceService refService;
	
	@PostMapping("/employee")
	public User registerEmployee(@RequestBody User users) throws AxionException {
		return service.registerEmployee(users);
	}
	
//	@GetMapping("/employee/login")
//	public User authentication(@RequestBody User users) throws AxionException{
//		return service.authenication(users);
//	}
	
	//adding location
	@PostMapping("employee/location")
	public Location addCity(@RequestBody Location location) throws AxionException {
		// TODO Auto-generated method stub
		
		return service.addCity(location);
	}
	
	@GetMapping("employee/location")
	public List<Location> getLocation() {
		return refService.getAllLocation();
	}
	
	@GetMapping("employee/promotion")
	public List<PromotionRequest> getAllPromotionRequests()  throws AxionException{
		return service.getAllPromotionRequests();
	}

	@DeleteMapping("employee/promotion/{id}")
	public void deletePromotionRequest(@PathVariable("id") int promid) throws AxionException {

		service.deletePromotionRequest(promid);
	}
	
}
