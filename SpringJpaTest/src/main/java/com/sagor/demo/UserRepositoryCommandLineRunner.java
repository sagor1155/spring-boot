package com.sagor.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sagor.demo.entity.User;
import com.sagor.demo.service.UserDAOService;
import com.sagor.demo.service.UserRepository;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;
	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Override
	public void run(String...arg0) throws Exception {
		User user = new User("Brad", "employee");
		userRepo.save(user);
		log.info("New user created: " + user);
		
		Optional<User> userWithIdOne = userRepo.findById(1L);
		log.info("User with Id One: " + userWithIdOne);
		
		List<User> allUser = userRepo.findAll();
		log.info("All user: " + allUser);
	}
}
