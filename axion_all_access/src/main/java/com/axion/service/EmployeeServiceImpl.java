package com.axion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.LocationDao;
import com.axion.dao.PromotionRequestDao;
import com.axion.dao.UserDao;
import com.axion.model.Location;
import com.axion.model.PromotionRequest;
import com.axion.model.User;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private LocationDao locationDao;
	@Autowired
	private PromotionRequestDao promotionRequestDao;

	@Override
	public User registerEmployee(User users) {
		return userDao.save(users);
	}

	@Override
	public User authenication(User users) {
		User user = userDao.findByUsername(users.getUsername());
		if (user == null) {
			throw new RuntimeException("User does not exist!");
		}
		if (!user.getPassword().equals(users.getPassword())) {
			System.out.println(user.getPassword() + " " + users.getPassword());
			throw new RuntimeException("Wrong password. Try again");
		}
		return user;
	}

	@Override
	public void updatePromotionRequest(PromotionRequest promotionRequest) {
		promotionRequestDao.save(promotionRequest);
	}

	@Override
	public Location addCity(Location location) {
		return locationDao.save(location);
	}

	@Override
	public List<PromotionRequest> getAllPromotionRequests() {
		return promotionRequestDao.findAll();
	}

//	@Override
//	public List<SuperBeing> getAllSuperBeings() {	
//		return superBeingDao.findAll();
//	}
//
//	@Override
//	public SuperBeing getBySuperName(String superName) {	
//		return superBeingDao.findBySuperName(superName);
//	}
//
//	@Override
//	public SuperBeing updateSuperBeing(SuperBeing superBeing) {	
//		return superBeingDao.save(superBeing);
//	}
//
//	@Override
//	public List<Team> getAllTeams() {		
//		return teamDao.findAll();
//	}
//
//	@Override
//	public Team getByTeamName(String teamName) {	
//		return teamDao.findByName(teamName);
//	}
//
//	@Override
//	public void deleteTransferRequest(TeamTransferRequest teamTransferRequest) {
//		teamTransferRequestDao.delete(teamTransferRequest);
//	}

}