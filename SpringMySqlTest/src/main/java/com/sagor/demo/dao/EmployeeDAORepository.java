package com.sagor.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagor.demo.entities.Employee;


public interface EmployeeDAORepository extends JpaRepository<Employee, Integer> {

}
