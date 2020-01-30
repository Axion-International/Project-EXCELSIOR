package com.axion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.axion.model.Alignment;
import com.axion.model.Location;
import com.axion.model.Role;

public class ReferenceController {
//	get all role
//	get all alignment
//	get all location
	
	@GetMapping("/role")
	public List<Role> getAllRole(@RequestBody Role role) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("/alignment")
	public List<Alignment> getAllAlignment(@RequestBody Alignment alignment) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("/role")
	public List<Location> getAllRole(@RequestBody Location location) {
		// TODO Auto-generated method stub
		return null;
	}
}
