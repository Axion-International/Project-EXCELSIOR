package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int teamId;
	
	@OneToOne
	SuperBeing teamLeader;
	
	String name;
	
	@OneToOne
	Location location;
	
	@OneToOne
	TeamStatus teamStatus;

	public Team(String name) {
		this.name = name;
	}
	
	
}
