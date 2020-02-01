package com.axion.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axion.model.SuperBeing;
import com.axion.service.SuperBeingService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SuperBeingController {
	
	@Autowired
	private SuperBeingService service;
	
	@PostMapping("user/superbeing")
	public SuperBeing registerSuperBeing(@RequestBody SuperBeing being) {
		// TODO Auto-generated method stub
		return service.registerSuperBeing(being);
	}
	
	@PutMapping("user/superbeing")
	public SuperBeing updateSuperBeing(@RequestBody SuperBeing being) {
		// TODO Auto-generated method stub
		return service.updateSuperBeing(being);
	}
	
	@GetMapping("user/superbeing")
	public List<SuperBeing> getAllSuperBeing() {
		// TODO Auto-generated method stub
		return service.getAllSuperBeing();
	}
	
	@GetMapping("user/superbeing/id/{userid}")
	public SuperBeing getByUserId(@PathVariable("userid") int userid) {
		// TODO Auto-generated method stub
		return service.getByUserId(userid);
	}
	
	@GetMapping("user/superbeing/name/{supername}")
	public List<SuperBeing> getBySupername(@PathVariable("supername") String supername) {
		// TODO Auto-generated method stub
		return service.getBySupername(supername);
	}
}
