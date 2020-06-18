package com.sagor.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagor.demo.model.Country;
import com.sagor.demo.service.CountryService;

@RestController
@RequestMapping(path="/page")
public class PageController {

	@Autowired
	CountryService service;
	
	@GetMapping(path="/{pageNo}/{pageSize}")
	public List<Country> getPaginatedList(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize){
		return service.findPaginated(pageNo, pageSize);
		
	}
}
