package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Alignment {
	@Id
	int alignment_id;
	String alignment;
	public Alignment(String alignment) {
		this.alignment = alignment;
	}
	
	
}
