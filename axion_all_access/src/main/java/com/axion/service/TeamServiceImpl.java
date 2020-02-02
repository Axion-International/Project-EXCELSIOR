package com.axion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.SuperBeingDao;
import com.axion.dao.TeamDao;
import com.axion.dao.TeamTransferRequestDao;
import com.axion.model.SuperBeing;
import com.axion.model.Team;
import com.axion.model.TeamTransferRequest;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamDao teamDao;
	@Autowired
	private TeamTransferRequestDao transferDao;
	@Autowired
	private SuperBeingDao superDao;
	
	@Override
	public Team createTeam(Team team) {
		// TODO Auto-generated method stub
		return teamDao.save(team);
	}

	@Override
	public Team UpdateTeam(Team team) {
		// TODO Auto-generated method stub
		return teamDao.save(team);
	}

	@Override
	public List<Team> getAllTeam() {
		// TODO Auto-generated method stub
		return teamDao.findAll();
	}

	@Override
	public List<TeamTransferRequest> getRequest(int teamId) {
		// TODO Auto-generated method stub
		return transferDao.findByTeam(teamId);
	}

	@Override
	public List<SuperBeing> getTeamMember(int teamId) {
		// TODO Auto-generated method stub
		return superDao.findByTeam(teamId);
	}

	@Override
	public SuperBeing addTeamMember(SuperBeing superbeing) {
		// TODO Auto-generated method stub
		return superDao.save(superbeing);
	}

	@Override
	public TeamTransferRequest updateTransferRequest(TeamTransferRequest teamTransferRequest) {
		// TODO Auto-generated method stub
		return transferDao.save(teamTransferRequest);
	}

	@Override
	public Team getByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return teamDao.findByName(teamName);
	}

}
