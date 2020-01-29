package com.axion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axion.model.TeamTransferRequest;

@Repository
public interface TeamTransferRequestDao extends JpaRepository<TeamTransferRequest, Integer> {

}
