package com.axion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.RequestStatusDao;
import com.axion.dao.TeamTransferRequestDao;
import com.axion.model.RequestStatus;
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

	@Override
	public List<TeamTransferRequest> getAllRequests() {
		RequestStatus pending = new RequestStatus();
		pending.setStatus_id(1);
		pending.setStatus_name("pending");
		return teamTransferRequestDao.findByRequestStatus(pending);
	}

	@Override
	public TeamTransferRequest updateTransfer(TeamTransferRequest teamTransferRequest) {
		// TODO Auto-generated method stub
		return teamTransferRequestDao.save(teamTransferRequest);
	}
}
