package com.sagor.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.sagor.demo.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>  {
	@Query(value = "SELECT * FROM COUNTRIES OFFSET :offset ROWS FETCH NEXT :size ROWS ONLY", nativeQuery = true)
	List<Country> findPageUsingOffset(@Param("offset") int offset, @Param("size") int size);
}
