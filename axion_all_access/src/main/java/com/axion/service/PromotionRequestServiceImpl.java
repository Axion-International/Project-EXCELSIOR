package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.PromotionRequestDao;
import com.axion.model.PromotionRequest;

@Service
public class PromotionRequestServiceImpl implements PromotionRequestService {
	@Autowired
	PromotionRequestDao promotionRequestDao;
	
	@Override
	public PromotionRequest addPromotionRequest(PromotionRequest promotionRequest) {
		
		return promotionRequestDao.save(promotionRequest);
	}

}
