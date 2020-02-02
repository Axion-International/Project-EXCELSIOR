package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int locationId;
	String city;
	public Location(String city) {
		this.city = city;
	}
	
	
}
