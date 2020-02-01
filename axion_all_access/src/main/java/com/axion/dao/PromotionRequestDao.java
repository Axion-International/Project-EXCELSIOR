package com.axion.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.PromotionRequest;
import com.axion.model.RequestStatus;

@Repository
public interface PromotionRequestDao extends JpaRepository<PromotionRequest, Integer>{
	List<PromotionRequest> findByRequestStatus(RequestStatus status);
}
