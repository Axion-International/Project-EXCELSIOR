package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TeamStatus {
	@Id
	int teamStatusId;
	String statusName;
}
