package com.axion.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class PromotionRequest {
	@Id
	int promId;
	
	@OneToMany
	List<SuperBeing> superbeing;
	
	@OneToMany
	List<RequestStatus> requestStatus;
	
}
