package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.TeamTransferRequestDao;
import com.axion.model.TeamTransferRequest;

@Service
public class TeamTransferRequestServiceImpl implements TeamTransferRequestService {
	@Autowired
	private TeamTransferRequestDao teamTransferRequestDao;

	@Override
	public TeamTransferRequest addTeamTransferRequest(TeamTransferRequest teamTransferRequest) {
		// TODO Auto-generated method stub
		return teamTransferRequestDao.save(teamTransferRequest);
	}
}
