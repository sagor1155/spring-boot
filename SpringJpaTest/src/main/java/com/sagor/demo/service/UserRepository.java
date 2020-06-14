package com.sagor.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagor.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
