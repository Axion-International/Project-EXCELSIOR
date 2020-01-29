package com.axion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.RequestStatus;

@Repository
public interface RequestStatusDao extends JpaRepository<RequestStatus, Integer> {

}
