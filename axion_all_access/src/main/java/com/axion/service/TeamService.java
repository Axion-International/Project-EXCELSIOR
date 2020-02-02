package com.axion.service;

import java.util.List;

import com.axion.model.SuperBeing;
import com.axion.model.Team;
import com.axion.model.TeamTransferRequest;

public interface TeamService {

	public Team createTeam(Team team);

	public Team UpdateTeam(Team team);

	public List<Team> getAllTeam();

	public List<TeamTransferRequest> getRequest(int teamId);

	public List<SuperBeing> getTeamMember(int teamId);
	
	public Team getByTeamName(String teamName);

	public SuperBeing addTeamMember(SuperBeing superbeing);

	public TeamTransferRequest updateTransferRequest(TeamTransferRequest teamTransferRequest);
}
