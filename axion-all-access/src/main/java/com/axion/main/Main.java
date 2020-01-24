package com.axion.main;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.axion.model.User;

public class Main {

	public static void main(String[] args) {	
		ApplicationContext context=new ClassPathXmlApplicationContext("axionbeans.xml");
		
		// User user = (User) context.getBean("user");
		
	}

}
