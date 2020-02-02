package com.axion.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.PromotionRequest;
import com.axion.model.RequestStatus;
import com.axion.model.TeamTransferRequest;

@Repository
public interface TeamTransferRequestDao extends JpaRepository<TeamTransferRequest, Integer> {
	List<TeamTransferRequest> findByTeam(int teamId);
	List<TeamTransferRequest> findByRequestStatus(RequestStatus status);
}
