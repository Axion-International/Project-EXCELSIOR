package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RequestStatus {
	@Id
	int status_id;
	
	String status_name;
}
