package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.RequestStatusDao;
import com.axion.model.RequestStatus;

@Service
public class RequestStatusServiceImpl implements RequestStatusService {
	@Autowired
	private RequestStatusDao requestStatusDao;

	@Override
	public RequestStatus addRequestStatus(RequestStatus requestStatus) {
		
		return requestStatusDao.save(requestStatus);
	}

}
