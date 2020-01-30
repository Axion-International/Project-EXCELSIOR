package com.axion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.AlignmentDao;
import com.axion.dao.LocationDao;
import com.axion.dao.RoleDao;
import com.axion.model.Alignment;
import com.axion.model.Location;
import com.axion.model.Role;

@Service
public class ReferenceServiceImpl implements ReferenceService {

	@Autowired
	private RoleDao roleDao;
	@Autowired
	private AlignmentDao alignDao;
	@Autowired
	private LocationDao locationDao;

	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return roleDao.findAll();
	}

	@Override
	public List<Alignment> getAllAlignment() {
		// TODO Auto-generated method stub
		return alignDao.findAll();
	}

	@Override
	public List<Location> getAllLocation() {
		// TODO Auto-generated method stub
		return locationDao.findAll();
	}

}
