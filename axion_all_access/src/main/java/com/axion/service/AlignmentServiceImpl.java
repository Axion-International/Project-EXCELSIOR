package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.AlignmentDao;
import com.axion.model.Alignment;

@Service
public class AlignmentServiceImpl implements AlignmentService {
	@Autowired
	private AlignmentDao alignmentDao;
	
	@Override
	public Alignment addAlignment(Alignment alignment) {
		System.out.println("MAIM: Adding alignment_id: " + alignment.getAlignment_id() + ", alignment: " + alignment.getAlignment());
		
		return alignmentDao.save(alignment);
	}

}
