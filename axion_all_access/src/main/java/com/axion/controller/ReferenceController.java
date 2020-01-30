package com.axion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.axion.model.Alignment;
import com.axion.model.Location;
import com.axion.model.Role;
import com.axion.service.ReferenceService;

public class ReferenceController {

	@Autowired
	private ReferenceService service;
	
	@GetMapping("/role")
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return service.getAllRole();
	}
	
	@GetMapping("/alignment")
	public List<Alignment> getAllAlignment() {
		// TODO Auto-generated method stub
		return service.getAllAlignment();
	}
	
	@GetMapping("/role")
	public List<Location> getAllLocation() {
		// TODO Auto-generated method stub
		return service.getAllLocation();
	}
}
