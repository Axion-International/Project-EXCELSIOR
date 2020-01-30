package com.axion;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.axion.dao.UserDao;
import com.axion.model.User;
import com.axion.service.EmployeeService;
import com.axion.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
class AxionAllAccessApplicationTests {

	@Autowired
	private UserService userService;
	@MockBean
	private UserDao userDao;
	
	@Test
	public void getUserByUsernameTest() {
		String username = "userTest";
		User user = new User("userTest","password");
		when(userDao.findByUsername(username)).thenReturn(user);
		assertEquals(user, userService.getUserByUsername(username));
	}
}
