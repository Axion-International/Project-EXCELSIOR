package com.axion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role,Integer> {

}
