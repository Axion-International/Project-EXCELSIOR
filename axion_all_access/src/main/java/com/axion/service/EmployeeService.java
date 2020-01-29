package com.axion.service;

import java.util.List;

import com.axion.model.PromotionRequest;
import com.axion.model.SuperBeing;
import com.axion.model.Team;
import com.axion.model.TeamTransferRequest;
import com.axion.model.User;

public interface EmployeeService {
	public User registerEmployee(User users);
	//public User findByUsername(String username);
	public User authenication(User users);
	public List<SuperBeing> getAllSuperBeings();
//	public SuperBeing getBySuperName(String superName);
	public SuperBeing updateSuperBeing(SuperBeing superBeing);
	public List<Team> getAllTeams();
//	public Team getByTeamName(String teamName);
	public void deleteTransferRequest(TeamTransferRequest teamTransferRequest);
	public void deletePromotionRequest(PromotionRequest promotionRequest);
	
}
