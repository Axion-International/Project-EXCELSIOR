package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.TeamStatusDao;
import com.axion.model.TeamStatus;

@Service
public class TeamStatusServiceImpl implements TeamStatusService {
	@Autowired
	TeamStatusDao teamStatusDao;

	@Override
	public TeamStatus addTeamStatus(TeamStatus teamStatus) {
		return teamStatusDao.save(teamStatus);
	}
	
	
}
