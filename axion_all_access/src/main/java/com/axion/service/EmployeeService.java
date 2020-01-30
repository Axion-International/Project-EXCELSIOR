package com.axion.service;

import com.axion.model.Location;
import com.axion.model.PromotionRequest;

import com.axion.model.User;

public interface EmployeeService {
	
	public User registerEmployee(User users);

	public User authenication(User users);

	public Location addCity(Location location);

	public void updatePromotionRequest(PromotionRequest promotionRequest);
//	public List<SuperBeing> getAllSuperBeings();
//	public SuperBeing getBySuperName(String superName);
//	public SuperBeing updateSuperBeing(SuperBeing superBeing);
//	public List<Team> getAllTeams();
//	public Team getByTeamName(String teamName);
//	public void deleteTransferRequest(TeamTransferRequest teamTransferRequest);
}
