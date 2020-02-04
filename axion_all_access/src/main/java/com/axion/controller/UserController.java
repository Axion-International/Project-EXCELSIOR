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

import com.axion.exception.AxionException;
import com.axion.model.TeamTransferRequest;
import com.axion.model.User;
import com.axion.service.TeamTransferRequestService;
import com.axion.service.UserService;

@RestController
@CrossOrigin(origins = "http://axionallaccesswebv1.1.s3-website.us-east-2.amazonaws.com:4200")
public class UserController {
	
	@Autowired
	private UserService service;
	@Autowired
	private TeamTransferRequestService teamTransferRequestService;
	
	@PostMapping("/user")
	public User registerUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return service.registerUser(user);
	}
	
	@PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        // TODO Auto-generated method stub
        return service.updateUser(user);
    }
	
	@GetMapping("user/{username}")
	public User getUserByUsername(@PathVariable String username) {
		// TODO Auto-generated method stub
		return service.getUserByUsername(username);
	}
	
	@PostMapping("/user/login")
	public User authentication(@RequestBody User user, HttpSession session) throws AxionException {
		return service.authentication(user, session);
	}
	
	@PostMapping("/employee/login")
	public User authenticateEmp(@RequestBody User user, HttpSession session) throws AxionException{		
		return service.authenticatEmp(user, session);
	
	}
	
	@GetMapping("/logoff")
	public void userLogoff(HttpSession session) {
		service.userLogoff(session);
	}
	
	@GetMapping("/transfer")
	public List<TeamTransferRequest> getAllRequests() {
		// TODO Auto-generated method stub
		return teamTransferRequestService.getAllRequests();
	}
	
	@PutMapping("/transfer")
	public TeamTransferRequest updateTransfer(TeamTransferRequest teamTransferRequest) {
		// TODO Auto-generated method stub
		return teamTransferRequestService.updateTransfer(teamTransferRequest);
	}
	
}
