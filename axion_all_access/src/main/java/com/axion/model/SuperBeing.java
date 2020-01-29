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
public class SuperBeing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int superBeingId;
	
	@OneToOne
	User user;
	
	String firstName;
	String lastName;
	String superName;
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
