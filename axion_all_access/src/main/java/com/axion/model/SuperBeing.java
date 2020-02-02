package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class SuperBeing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int superBeingId;	
	String firstName;
	String lastName;
	String superName;
	boolean isLeader;
	int strength;
	int constitution;
	int agility;
	int intelligence;
	
	@OneToOne
	Alignment alignment;
	
	@OneToOne
	Team team;
	
	String abilities;

	public SuperBeing(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
}
