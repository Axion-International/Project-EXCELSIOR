package com.axion.service;

import java.util.List;

import com.axion.model.Alignment;
import com.axion.model.Location;
import com.axion.model.Role;

public interface ReferenceService {

	public List<Role> getAllRole();
	
	public List<Alignment> getAllAlignment();
	
	public List<Location> getAllLocation();
	
}
