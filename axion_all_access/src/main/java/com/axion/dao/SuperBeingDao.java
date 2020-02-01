package com.axion.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.SuperBeing;
import com.axion.model.User;

@Repository
public interface SuperBeingDao extends JpaRepository<SuperBeing, Integer> {
	SuperBeing findBySuperName(String superName);
	SuperBeing findByUser(int userid);
	List<SuperBeing> findByTeam(int teamId);
	Boolean isLeader();
}
