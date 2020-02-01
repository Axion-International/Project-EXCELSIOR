package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.LocationDao;
import com.axion.model.Location;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	LocationDao locationDao;

	@Override
	public Location addLocation(Location location) {
		
		return locationDao.save(location);
	}
}
