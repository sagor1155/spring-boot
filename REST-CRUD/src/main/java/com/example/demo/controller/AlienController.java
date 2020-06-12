package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping(path="/aliens", produces= {"application/xml", "application/json"})
	@ResponseBody				//to return data instead of view
	public List<Alien> getAliens() {
		
		return repo.findAll();
	}

	@RequestMapping(path="/alien/{aid}", produces= {"application/xml"})		// aid is path variable (from request url) 
	@ResponseBody						//to return data instead of view
	public Optional<Alien> getAlien(@PathVariable("aid") int id) {
		
		return repo.findById(id);
	}	
}
