package com.axion.model;

import java.io.Serializable;

import javax.persistence.Entity;
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
public class Role implements Serializable {
	@Id
	int roleId;
	
	String roleName;

	public Role(String roleName) {
		this.roleName = roleName;
	}
	
	
}
