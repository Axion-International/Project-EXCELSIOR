package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Team {
	@Id
	int teamId;
	
	@OneToOne
	SuperBeing teamLeader;
	
	String name;
	
	@ManyToOne
	Location location;
	
	@ManyToOne
	TeamStatus teamStatus;
}
