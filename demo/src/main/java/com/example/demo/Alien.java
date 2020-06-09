package com.example.demo;

import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
//@Scope(value="prototype")
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	
	@Autowired		// search by object type (laptop object of Laptop.class)  
	@Qualifier("laptop1")		// search by object name 
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("Alien Object Created...");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show() {
		System.out.println("Alien name: " + this.aname);
		laptop.compile();
	}

	
}
