package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Location {
	@Id
	int location_id;
	String city;
}
