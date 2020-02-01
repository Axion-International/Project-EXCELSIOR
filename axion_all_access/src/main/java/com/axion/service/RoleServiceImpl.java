package com.axion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axion.dao.RoleDao;
import com.axion.model.Role;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleDao roleDao;

	@Override
	public Role addRole(Role role) {
		return roleDao.save(role);
	}
	
	
}
