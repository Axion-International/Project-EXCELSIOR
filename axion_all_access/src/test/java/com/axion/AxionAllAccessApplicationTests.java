//package com.axion;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.headerDoesNotExist;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.axion.dao.AlignmentDao;
//import com.axion.dao.LocationDao;
//import com.axion.dao.PromotionRequestDao;
//import com.axion.dao.RoleDao;
//import com.axion.dao.RequestStatusDao;
//import com.axion.dao.SuperBeingDao;
//import com.axion.dao.TeamDao;
//import com.axion.dao.TeamStatusDao;
//import com.axion.dao.TeamTransferRequestDao;
//import com.axion.dao.UserDao;
//import com.axion.model.Alignment;
//import com.axion.model.Location;
//import com.axion.model.Role;
//import com.axion.model.SuperBeing;
//import com.axion.model.Team;
//import com.axion.model.User;
//import com.axion.service.EmployeeService;
//import com.axion.service.ReferenceService;
//import com.axion.service.SuperBeingService;
//import com.axion.service.TeamService;
//import com.axion.service.UserService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class AxionAllAccessApplicationTests {
//
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private EmployeeService employeeService;
//	@Autowired
//	private ReferenceService referenceService;
//	@Autowired
//	private SuperBeingService superBeingService;
//	@Autowired
//	private TeamService teamService;
//
//	@MockBean
//	private UserDao userDao;
//	@MockBean
//	private AlignmentDao alignmentDao;
//	@MockBean
//	private LocationDao locationDao;
//	@MockBean
//	private PromotionRequestDao promotionRequestDao;
//	@MockBean
//	private RequestStatusDao requestStatusDao;
//	@MockBean
//	private RoleDao roleDao;
//	@MockBean
//	private SuperBeingDao superBeingDao;
//	@MockBean
//	private TeamDao teamDao;
//	@MockBean
//	private TeamStatusDao teamStatusDao;
//	@MockBean
//	private TeamTransferRequestDao teamTransferRequestDao;
//	
//	@Test
//	public void getUserByUsernameTest() {
//		String username = "userTest";
//		User user = new User("userTest","password");
//		when(userDao.findByUsername(username)).thenReturn(user);
//		assertEquals(user, userService.getUserByUsername(username));
//	}
//	
//	@Test
//	public void registerSuperBeingTest() {
//		SuperBeing superBeing = new SuperBeing("superTest","lastname");
//		when(superBeingDao.save(superBeing)).thenReturn(superBeing);
//		assertEquals(superBeing, superBeingService.registerSuperBeing(superBeing));
//	}
//	
//	@Test
//	public void updateSuperBeingTest() {
//		SuperBeing superBeing = new SuperBeing("superTest","lastname");
//		when(superBeingDao.save(superBeing)).thenReturn(superBeing);
//		assertEquals(superBeing, superBeingService.updateSuperBeing(superBeing));
//	}
//	
//	@Test
//	public void getAllSuperBeingTest() {
//		SuperBeing superBeing = new SuperBeing("superTest","lastname");
//		List<SuperBeing> superBeings = new ArrayList<>();
//		superBeings.add(superBeing);
//		when(superBeingDao.findAll()).thenReturn(superBeings);
//		assertEquals(superBeings, superBeingService.getAllSuperBeing());
//	}
//	
//	@Test
//	public void getAllRoleTest() {
//		Role role = new Role("roleTest");
//		List<Role> roles = new ArrayList<>();
//		roles.add(role);
//		when(roleDao.findAll()).thenReturn(roles);
//		assertEquals(roles, referenceService.getAllRole());
//	}
//	
//	@Test
//	public void getAllAlignmentTest() {
//		Alignment alignment = new Alignment("alignmentTest");
//		List<Alignment> alignments = new ArrayList<>();
//		alignments.add(alignment);
//		when(alignmentDao.findAll()).thenReturn(alignments);
//		assertEquals(alignments, referenceService.getAllAlignment());
//	}
//	
//	@Test
//	public void getAllLocationTest() {
//		Location location = new Location("locationTest");
//		List<Location> locations = new ArrayList<>();
//		locations.add(location);
//		when(locationDao.findAll()).thenReturn(locations);
//		assertEquals(locations, referenceService.getAllLocation());
//	}
//	
//	@Test
//	public void getAllTeamTest() {
//		Team team = new Team("teamTest");
//		List<Team> teams = new ArrayList<>();
//		teams.add(team);
//		when(teamDao.findAll()).thenReturn(teams);
//		assertEquals(teams, teamService.getAllTeam());
//	}
//	
//	@Test
//	public void createTeamTest() {
//		Team team = new Team("teamTest");
//		when(teamDao.save(team)).thenReturn(team);
//		assertEquals(team, teamService.createTeam(team));
//	}
//	
//	@Test
//	public void registerSuperBeingTest() {
//		SuperBeing superBeing = new SuperBeing("teamTest","lastname");
//		Team team = new Team();
//		team.setTeamId(1);
//		superBeing.setTeam(team);
//		when(teamDao.findById(team.getTeamId())).thenReturn(superBeing);
//		assertEquals(superBeing, teamService.getTeamMember(team.getTeamId()));
//	}
//}
