package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping(path="/aliens", produces= {"application/xml", "application/json"})
	public List<Alien> getAliens() {
		return repo.findAll();
	}

	@GetMapping(path="/alien/{aid}", produces= {"application/xml"})		// aid is path variable (from request url) 
	public Optional<Alien> getAlien(@PathVariable("aid") int id) {
		return repo.findById(id);
	}	

	@PostMapping(path="/alien", consumes= {"application/json"})
	//	public Alien addAlien(Alien alien) {	//for form data 
	public Alien addAlien(@RequestBody Alien alien) {	//for raw json/xml data 	
		repo.save(alien);
		return alien;
	}
	
	@PutMapping(path="/alien", consumes= {"application/json"})
	public Alien updateAlien(@RequestBody Alien alien) {	 	
		repo.save(alien);
		return alien;
	}	
	
	@DeleteMapping(path="/alien/{aid}")
	public String deleteAlien(@PathVariable("aid") int id) {
		Alien alien = repo.getOne(id);
		repo.delete(alien);
		return "Alien deleted successfully";
	}
	

}
