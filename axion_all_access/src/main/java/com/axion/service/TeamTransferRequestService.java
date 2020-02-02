package com.axion.service;

import java.util.List;

import com.axion.model.TeamTransferRequest;

public interface TeamTransferRequestService {
	TeamTransferRequest addTeamTransferRequest(TeamTransferRequest teamTransferRequest);
	List<TeamTransferRequest> getAllRequests();
	TeamTransferRequest updateTransfer(TeamTransferRequest teamTransferRequest);
}
