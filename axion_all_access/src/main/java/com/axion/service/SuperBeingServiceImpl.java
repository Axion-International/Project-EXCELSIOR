package com.axion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.SuperBeingDao;
import com.axion.model.SuperBeing;

@Service
public class SuperBeingServiceImpl implements SuperBeingService {
	
	@Autowired
	private SuperBeingDao superBeingDao;
	
	@Override
	public SuperBeing registerSuperBeing(SuperBeing being) {
		// TODO Auto-generated method stub
		return superBeingDao.save(being);
	}

	@Override
	public SuperBeing updateSuperBeing(SuperBeing being) {
		// TODO Auto-generated method stub
		return superBeingDao.save(being);
	}

	@Override
	public List<SuperBeing> getAllSuperBeing() {
		// TODO Auto-generated method stub
		return superBeingDao.findAll();
	}

	@Override
	public SuperBeing getByUserId(int userid) {
		// TODO Auto-generated method stub
		return superBeingDao.findByUser(userid);
	}

	@Override
	public SuperBeing getBySupername(String supername) {
		// TODO Auto-generated method stub
		return superBeingDao.findBySuperName(supername);
	}

}
