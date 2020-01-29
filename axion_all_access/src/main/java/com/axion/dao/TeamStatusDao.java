package com.axion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.TeamStatus;

@Repository
public interface TeamStatusDao extends JpaRepository<TeamStatus, Integer> {

}
