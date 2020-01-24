package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Alignment {
	@Id
	int alignment_id;
	String alignment;
}
