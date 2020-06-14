package com.sagor.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagor.demo.dao.EmployeeDAORepository;
import com.sagor.demo.entities.Employee;

@RestController
@RequestMapping(path="/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeDAORepository repo;
	
	@GetMapping(path="/all")
	public List<Employee> getAllEmployee(){
		List<Employee> allemp = repo.findAll();
		return allemp;
	}

	@GetMapping(path="/{id}")	
	public Optional<Employee> getEmployee(@PathVariable("id") int id) {
		return repo.findById(id);
	}	
	
	@PostMapping(path="/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		repo.save(emp);
		return emp;
	}
	
	@PutMapping(path="/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		 repo.save(emp);
		return emp;
	}
	
}
