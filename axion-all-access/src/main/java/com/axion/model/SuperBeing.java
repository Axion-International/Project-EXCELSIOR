package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class SuperBeing {
	@Id
	int superBeingId;
	
	@OneToOne
	User user;
	
	String firstName;
	String lastName;
	int strength;
	int constitution;
	int agility;
	int intelligence;
	
	@OneToOne
	Alignment alignment;
	
	@OneToOne
	Team team;
	
	String abilities;
}
