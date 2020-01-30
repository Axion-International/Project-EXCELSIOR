package com.axion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axion.model.SuperBeing;
import com.axion.model.Team;
import com.axion.model.TeamTransferRequest;
import com.axion.service.TeamService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeamController {
	
	@Autowired
	private TeamService service;
	//create a team
	@PostMapping("/team")
	public Team createTeam(@RequestBody Team team) {
		// TODO Auto-generated method stub
		return service.createTeam(team);
	}
	@PutMapping("/team")
	public Team UpdateTeam(@RequestBody Team team) {
		// TODO Auto-generated method stub
		return service.UpdateTeam(team);
	}
	//get all team list
	@GetMapping("/team")
	public List<Team> getAllTeam() {
		// TODO Auto-generated method stub
		return service.getAllTeam();
	}
	
	//get transfer for the team
	@GetMapping("/team/request/{teamid}")
	public List <TeamTransferRequest> getRequest(@PathVariable("teamid") int teamId) {
		// TODO Auto-generated method stub
		return service.getRequest(teamId);
	}
	
	//get all member for the team
	@GetMapping("/team/member")
	public List<SuperBeing> getTeamMember(int teamId) {
		// TODO Auto-generated method stub
		return service.getTeamMember(teamId);
	}
	//adding team member
	@PutMapping("/team/add")
	public SuperBeing addTeamMember(SuperBeing superbeing) {
		// TODO Auto-generated method stub
		return service.addTeamMember(superbeing);
	}
	
	@PutMapping("/team/transfer")
	public TeamTransferRequest updateTransferRequest(TeamTransferRequest teamTransferRequest) {
		// TODO Auto-generated method stub
		return service.updateTransferRequest(teamTransferRequest);
	}
	
	
}
