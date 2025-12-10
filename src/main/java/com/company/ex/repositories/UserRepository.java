package com.company.ex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.ex.entities.User;

// Optional
@Repository 
public interface UserRepository extends JpaRepository<User, Long>{
	
}
