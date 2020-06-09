package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("....................................");
		System.out.println("First Spring Boot Application");
		Alien a = context.getBean(Alien.class);
		a.setAname("glaxios");
		a.show();
		
		
		System.out.println("....................................");
	}

}
