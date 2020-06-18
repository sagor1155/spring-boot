package com.sagor.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sagor.demo.model.Country;
import com.sagor.demo.repo.CountryRepository;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;

@Service
public class CountryService {

	@Autowired
	CountryRepository repo;
	
	public List<Country> findPaginated(int pageNo, int pageSize) {
		
		// using built-in library
		/*
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<Country> pagedResult = repo.findAll(paging);
		return pagedResult.toList();
		*/
		
		// using native query 
		int offset = pageNo * pageSize;
		return repo.findPageUsingOffset(offset, pageSize);
	}
}
