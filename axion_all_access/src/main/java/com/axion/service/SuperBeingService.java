package com.axion.service;

import java.util.List;

import com.axion.model.SuperBeing;

public interface SuperBeingService {

	public SuperBeing registerSuperBeing(SuperBeing being);

	public SuperBeing updateSuperBeing(SuperBeing being);

	public List<SuperBeing> getAllSuperBeing();

	public SuperBeing getByUserId(int userid);

	public SuperBeing getBySupername(String supername);

}
