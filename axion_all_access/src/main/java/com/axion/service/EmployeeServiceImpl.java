package com.axion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.PromotionRequestDao;
import com.axion.dao.SuperBeingDao;
import com.axion.dao.TeamDao;
import com.axion.dao.TeamTransferRequestDao;
import com.axion.dao.UserDao;
import com.axion.model.PromotionRequest;
import com.axion.model.SuperBeing;
import com.axion.model.Team;
import com.axion.model.TeamTransferRequest;
import com.axion.model.User;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private SuperBeingDao superBeingDao;
	@Autowired
	private TeamDao teamDao;
	@Autowired
	private TeamTransferRequestDao teamTransferRequestDao;
	@Autowired
	private PromotionRequestDao promotionRequestDao;
	
	@Override
	public User registerEmployee(User users) {
		return userDao.save(users);
	}

	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public List<SuperBeing> getAllSuperBeings() {	
		return superBeingDao.findAll();
	}

	@Override
	public SuperBeing getBySuperName(String superName) {	
		return superBeingDao.findbySuperName(superName);
	}

	@Override
	public SuperBeing updateSuperBeing(SuperBeing superBeing) {	
		return superBeingDao.save(superBeing);
	}

	@Override
	public List<Team> getAllTeams() {		
		return teamDao.findAll();
	}

	@Override
	public Team getByTeamName(String teamName) {	
		return teamDao.findbyTeamName(teamName);
	}

	@Override
	public void deleteTransferRequest(TeamTransferRequest teamTransferRequest) {
		teamTransferRequestDao.delete(teamTransferRequest);
	}

	@Override
	public void deletePromotionRequest(PromotionRequest promotionRequest) {
		promotionRequestDao.delete(promotionRequest);
	}


}