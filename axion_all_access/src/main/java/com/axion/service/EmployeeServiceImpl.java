package com.axion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.LocationDao;
import com.axion.dao.PromotionRequestDao;
import com.axion.dao.UserDao;
import com.axion.exception.AxionException;
import com.axion.model.Location;
import com.axion.model.PromotionRequest;
import com.axion.model.RequestStatus;
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
	public User registerEmployee(User users) throws AxionException{
		User userCanRegister = userDao.save(users);
		if (userCanRegister != null) {
			throw new AxionException("User "+users.getUsername()+" is already registered");
		}
		return userCanRegister;
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
	public Location addCity(Location location) throws AxionException {
		Location locationCan = locationDao.save(location);
		if(locationCan == null) {
			throw new AxionException("Internal error has occured please call customer service for support");
		}
		return locationDao.save(location);
	}

	@Override
	public List<PromotionRequest> getAllPromotionRequests() {
		RequestStatus pending = new RequestStatus();
		pending.setStatus_id(1);
		pending.setStatus_name("pending");
		return  promotionRequestDao.findByRequestStatus(pending);
	}

	@Override
	public void deletePromotionRequest(int promid) throws AxionException {
		// TODO Auto-generated method stub
		promotionRequestDao.deleteById(promid);
		
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