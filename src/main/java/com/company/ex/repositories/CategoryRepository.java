package com.company.ex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.ex.entities.Category;

// Optional
@Repository 
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
