package com.axion.service;

import java.util.List;

import com.axion.model.Location;

public interface LocationService {
	public Location addLocation(Location location);
	public List<Location> getAllLocations();
}
