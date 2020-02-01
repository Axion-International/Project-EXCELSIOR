package com.axion.service;

import java.util.List;

import com.axion.exception.AxionException;
import com.axion.model.Location;
import com.axion.model.PromotionRequest;

import com.axion.model.User;

public interface EmployeeService {
	
	public User registerEmployee(User users) throws AxionException;

	public User authenication(User users);

	public Location addCity(Location location) throws AxionException;
	
	public List<PromotionRequest> getAllPromotionRequests() throws AxionException;

	public void deletePromotionRequest(int promid)throws AxionException;

//	public List<SuperBeing> getAllSuperBeings();
//	public SuperBeing getBySuperName(String superName);
//	public SuperBeing updateSuperBeing(SuperBeing superBeing);
//	public List<Team> getAllTeams();
//	public Team getByTeamName(String teamName);
//	public void deleteTransferRequest(TeamTransferRequest teamTransferRequest);
}
