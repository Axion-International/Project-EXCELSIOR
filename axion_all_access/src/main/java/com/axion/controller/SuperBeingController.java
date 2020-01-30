package com.axion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axion.model.SuperBeing;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SuperBeingController {
	// TODO Auto-generated method stub
	
	@PostMapping("user/superbeing")
	public SuperBeing registerSuperBeing(@RequestBody SuperBeing being) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@PutMapping("user/superbeing")
	public SuperBeing updateSuperBeing(@RequestBody SuperBeing being) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("user/superbeing")
	public List<SuperBeing> getAllSuperBeing() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("user/superbeing/{userid}")
	public SuperBeing getByUserId(@PathVariable("userid") int userid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("user/superbeing/{supername}")
	public SuperBeing getBySupername(@PathVariable("supername") String supername) {
		// TODO Auto-generated method stub
		return null;
	}
}
