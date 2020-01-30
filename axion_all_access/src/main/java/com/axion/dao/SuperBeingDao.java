package com.axion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.SuperBeing;

@Repository
public interface SuperBeingDao extends JpaRepository<SuperBeing, Integer> {
	SuperBeing findBySuperName(String superName);
}
