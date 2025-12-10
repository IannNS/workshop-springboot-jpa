package com.company.ex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.ex.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
