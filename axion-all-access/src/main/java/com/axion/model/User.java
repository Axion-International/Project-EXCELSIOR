package com.axion.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	int userId;
	String username;
	String password;
	@OneToOne(fetch = FetchType.LAZY)
	Role role;
}
