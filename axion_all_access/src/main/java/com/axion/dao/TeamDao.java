package com.axion.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.Team;

@Repository
public interface TeamDao extends JpaRepository<Team, Integer> {
	Team findByName(String teamName);
}
