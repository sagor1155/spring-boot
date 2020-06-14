package com.sagor.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sagor.demo.entity.User;
import com.sagor.demo.service.UserDAOService;


@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserDAOService userService;
	
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Override
	public void run(String...arg0) throws Exception {
		User user = new User("Jack", "admin");
		long id = userService.insert(user);
		log.info("New user created: " + user);
	}
}
