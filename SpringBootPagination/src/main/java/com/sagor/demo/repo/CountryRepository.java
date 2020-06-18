package com.sagor.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.sagor.demo.model.Country;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Integer>  {

}
