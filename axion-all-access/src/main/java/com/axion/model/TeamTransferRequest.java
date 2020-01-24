package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class TeamTransferRequest {
	@Id
	int teamTransferId;
	
	@OneToOne
	SuperBeing superBeing;
	
	@OneToOne
	Team team;
	
	@OneToOne
	RequestStatus requestStatus;
	
}
