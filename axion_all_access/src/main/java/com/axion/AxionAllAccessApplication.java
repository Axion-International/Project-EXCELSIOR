package com.axion;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.axion.model.Alignment;
import com.axion.model.Location;
import com.axion.model.PromotionRequest;
import com.axion.model.RequestStatus;
import com.axion.model.Role;
import com.axion.model.SuperBeing;
import com.axion.model.Team;
import com.axion.model.TeamStatus;
import com.axion.model.TeamTransferRequest;
import com.axion.model.User;
import com.axion.service.AlignmentServiceImpl;
import com.axion.service.LocationServiceImpl;
import com.axion.service.PromotionRequestServiceImpl;
import com.axion.service.RequestStatusServiceImpl;
import com.axion.service.RoleServiceImpl;
import com.axion.service.SuperBeingServiceImpl;
import com.axion.service.TeamServiceImpl;
import com.axion.service.TeamStatusServiceImpl;
import com.axion.service.TeamTransferRequestServiceImpl;
import com.axion.service.UserServiceImpl;

@SpringBootApplication
public class AxionAllAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(AxionAllAccessApplication.class, args);
		
	}	
	
	// H2 Stub data
	@Bean
	public CommandLineRunner sellerDemoData(
				AlignmentServiceImpl alignmentService,
				RoleServiceImpl roleService,
				LocationServiceImpl locationService,
				RequestStatusServiceImpl requestStatusService,
				SuperBeingServiceImpl superBeingService,
				TeamStatusServiceImpl teamStatusService,
				TeamServiceImpl teamService,
				UserServiceImpl userService,
				PromotionRequestServiceImpl promotionRequestService,
				TeamTransferRequestServiceImpl teamTransferRequestService) {
		
		return args -> {
			// Alignment stub data
			System.out.println("Generating the Alignment info.................................................");
			Alignment alignment1 = new Alignment();
			alignment1.setAlignment_id(1);
			alignment1.setAlignment("Hero");
			System.out.println("MAIM: Adding alignment_id: " + alignment1.getAlignment_id() + ", alignment: " + alignment1.getAlignment());
			alignmentService.addAlignment(alignment1);

			Alignment alignment2 = new Alignment();
			alignment2.setAlignment_id(2);
			alignment2.setAlignment("Neutral");
			alignmentService.addAlignment(alignment2);
			
			Alignment alignment3 = new Alignment();
			alignment3.setAlignment_id(3);
			alignment3.setAlignment("Villain");
			alignmentService.addAlignment(alignment3);
			
			// Role stub data
			System.out.println("Generating the Role info.................................................");
			Role role1 = new Role();
			role1.setRoleId(1);
			role1.setRoleName("User");
			roleService.addRole(role1);

			Role role2 = new Role();
			role2.setRoleId(2);
			role2.setRoleName("Leader");
			roleService.addRole(role2);

			Role role3 = new Role();
			role3.setRoleId(3);
			role3.setRoleName("Employee");
			roleService.addRole(role3);
			
			// Location stub data
			System.out.println("Generating the Location info.................................................");
			Location location0 = new Location();
			location0.setLocation_id(1);
			location0.setCity("Austin");
			locationService.addLocation(location0);

			Location location1 = new Location();
			location1.setLocation_id(2);
			location1.setCity("Pittsburgh");
			locationService.addLocation(location1);

			Location location2 = new Location();
			location2.setLocation_id(3);
			location2.setCity("Detroit");
			locationService.addLocation(location2);
			
			// RequestStatus stub data
			System.out.println("Generating the RequestStatus info.................................................");
			RequestStatus rq1 = new RequestStatus();
			rq1.setStatus_id(1);
			rq1.setStatus_name("Pending");
			requestStatusService.addRequestStatus(rq1);

			RequestStatus rq2 = new RequestStatus();
			rq2.setStatus_id(2);
			rq2.setStatus_name("Approved");
			requestStatusService.addRequestStatus(rq2);

			RequestStatus rq3 = new RequestStatus();
			rq3.setStatus_id(3);
			rq3.setStatus_name("Rejected");
			requestStatusService.addRequestStatus(rq3);
			
			// SuperBeing stub data

			SuperBeing sb1 = new SuperBeing();
			sb1.setSuperBeingId(1);
			sb1.setFirstName("Sam");
			sb1.setLastName("Cunnginham");
			sb1.setSuperName("EyeKnot");
			sb1.setStrength(7);
			sb1.setAgility(26);
			sb1.setConstitution(3);
			sb1.setIntelligence(14);
			sb1.setAbilities("Psychometry");
			sb1.setAlignment(alignment1);
			sb1.setLeader(false);
			superBeingService.registerSuperBeing(sb1);

			SuperBeing sb2 = new SuperBeing();
			sb2.setSuperBeingId(2);
			sb2.setFirstName("Jorge");
			sb2.setLastName("Rosaro");
			sb2.setSuperName("Foojoo");
			sb2.setStrength(23);
			sb2.setAgility(3);
			sb2.setConstitution(4);
			sb2.setIntelligence(22);
			sb2.setAbilities("Divination");
			sb2.setAlignment(alignment1);
			sb2.setLeader(false);
			superBeingService.registerSuperBeing(sb2);

			SuperBeing sb3 = new SuperBeing();
			sb3.setSuperBeingId(3);
			sb3.setFirstName("Mic");
			sb3.setLastName("Dundee");
			sb3.setSuperName("Crocodile Dundee");
			sb3.setStrength(12);
			sb3.setAgility(15);
			sb3.setConstitution(15);
			sb3.setIntelligence(11);
			sb3.setAbilities("Animal Communication");
			sb3.setAlignment(alignment1);
			sb3.setLeader(false);
			superBeingService.registerSuperBeing(sb3);

			SuperBeing sb4 = new SuperBeing();
			sb4.setSuperBeingId(4);
			sb4.setFirstName("Sufyan");
			sb4.setLastName("Fofana");
			sb4.setSuperName("Walking Thunder");
			sb4.setStrength(12);
			sb4.setAgility(15);
			sb4.setConstitution(15);
			sb4.setIntelligence(34);
			sb4.setAbilities("Takes Thunder on walks");
			sb4.setAlignment(alignment1);
			sb4.setLeader(false);
			superBeingService.registerSuperBeing(sb3);

			SuperBeing sb5 = new SuperBeing();
			sb5.setSuperBeingId(5);
			sb5.setFirstName("Rick");
			sb5.setLastName("James Bitch");
			sb5.setSuperName("Rick James");
			sb5.setStrength(10);
			sb5.setAgility(7);
			sb5.setConstitution(6);
			sb5.setIntelligence(2);
			sb5.setAbilities("He's Rick James");
			sb5.setAlignment(alignment1);
			sb5.setLeader(false);
			superBeingService.registerSuperBeing(sb5);		

//			System.out.println("Generating the SuperBeing info.................................................");
//			SuperBeing sb6 = new SuperBeing();
//			sb6.setSuperBeingId(6);
//			sb6.setAgility(0);
//			sb6.setAlignment(alignment1);
//			sb6.setConstitution(0);
//			sb6.setFirstName("Joe");
//			sb6.setLastName("Smith");
//			sb6.setIntelligence(0);
//			sb6.setLeader(false);
//			sb6.setStrength(0);
//			sb6.setSuperName("null guy");
//			sb6.setAbilities("Resurrection");
//			superBeingService.registerSuperBeing(sb6);
			
			// PromotionRequest stub data
			System.out.println("Generating the PromotionRequest info.................................................");
			PromotionRequest pr0 = new PromotionRequest();
			pr0.setPromId(1);
			pr0.setRequestStatus(rq1);
			pr0.setSuperbeing(sb3);
			promotionRequestService.addPromotionRequest(pr0);

			PromotionRequest pr1 = new PromotionRequest();
			pr1.setPromId(2);
			pr1.setRequestStatus(rq1);
			pr1.setSuperbeing(sb2);
			promotionRequestService.addPromotionRequest(pr1);
			
			// Team status stub data
			System.out.println("Generating the Team Status info.................................................");
			TeamStatus ts0 = new TeamStatus();
			ts0.setTeamStatusId(0);
			ts0.setStatusName("Dead");
			teamStatusService.addTeamStatus(ts0);

			TeamStatus ts1 = new TeamStatus();
			ts1.setTeamStatusId(1);
			ts1.setStatusName("Acitve");
			teamStatusService.addTeamStatus(ts1);

			TeamStatus ts2 = new TeamStatus();
			ts2.setTeamStatusId(2);
			ts2.setStatusName("Lost");
			teamStatusService.addTeamStatus(ts2);

			TeamStatus ts3 = new TeamStatus();
			ts3.setTeamStatusId(3);
			ts3.setStatusName("Unknown");
			teamStatusService.addTeamStatus(ts3);

			TeamStatus ts4 = new TeamStatus();
			ts4.setTeamStatusId(4);
			ts4.setStatusName("Suspended");
			teamStatusService.addTeamStatus(ts4);

			TeamStatus ts5 = new TeamStatus();
			ts5.setTeamStatusId(5);
			ts5.setStatusName("Frozen in Carbonite");
			teamStatusService.addTeamStatus(ts5);
			
			// Team stub Data

			Team team1 = new Team();
			team1.setTeamId(1);
			team1.setLocation(location1);
			team1.setName("Ridiculosity");
			team1.setTeamStatus(ts1);
			teamService.createTeam(team1);
			
			Team team2 = new Team();
			team2.setTeamId(2);
			team2.setLocation(location2);
			team2.setName("Farmer's Targets");
			team2.setTeamStatus(ts1);
			teamService.createTeam(team2);			

			Team team0 = new Team();
			team0.setTeamId(3);
			team0.setLocation(location1);
			team0.setName("Boombasticalicious");
			team0.setTeamStatus(ts1);
			teamService.createTeam(team0);
			
			
			sb1.setTeam(team0);
			sb2.setTeam(team0);
			sb3.setTeam(team1);
			sb4.setTeam(team2);
			sb5.setTeam(team1);
			superBeingService.updateSuperBeing(sb1);
			superBeingService.updateSuperBeing(sb2);
			superBeingService.updateSuperBeing(sb3);
			superBeingService.updateSuperBeing(sb4);
			superBeingService.updateSuperBeing(sb5);
			
			// TeamTransferRequest stub data
			TeamTransferRequest ttr0 = new TeamTransferRequest();
			ttr0.setTeamTransferId(1);
			ttr0.setTeam(team0);
			ttr0.setSuperBeing(sb3);
			ttr0.setRequestStatus(rq1);
			teamTransferRequestService.addTeamTransferRequest(ttr0);
			
			// User stub data
			System.out.println("Generating the User info.................................................");
			User user1 = new User();
			user1.setRole(role2);
			user1.setUserId(1);
			user1.setUsername("lululuvely");
			user1.setPassword("hubbawubba");
			user1.setSuperbeing(sb1);
			userService.registerUser(user1);

			User user2 = new User();
			user2.setRole(role1);
			user2.setUserId(2);
			user2.setUsername("samiam");
			user2.setPassword("ilovegreeneggsandham");
			user2.setSuperbeing(sb2);
			userService.registerUser(user2);
			
			User user3 = new User();
			user3.setRole(role3);
			user3.setUserId(3);
			user3.setUsername("admin");
			user3.setPassword("admin");
			userService.registerUser(user3);
			
			User user4 = new User();
			user4.setRole(role1);
			user4.setUserId(4);
			user4.setUsername("sufyan");
			user4.setPassword("sufyan");
			user4.setSuperbeing(sb4);
			userService.registerUser(user4);

			User user5 = new User();
			user5.setRole(role1);
			user5.setUserId(5);
			user5.setUsername("adminisnothere");
			user5.setPassword("onceaday");
			user5.setSuperbeing(sb3);
			userService.registerUser(user5);
			
			User user6 = new User();
			user6.setRole(role1);
			user6.setUserId(6);
			user6.setUsername("checkthisout");
			user6.setPassword("blahblah");
			user6.setSuperbeing(sb5);
			userService.registerUser(user6);
			
		};
	}

}
