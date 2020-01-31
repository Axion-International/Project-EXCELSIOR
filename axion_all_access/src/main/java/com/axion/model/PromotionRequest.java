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
public class PromotionRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int promId;
	
	@OneToOne
	SuperBeing superbeing;
	
	@OneToOne
	RequestStatus requestStatus;
	
}
