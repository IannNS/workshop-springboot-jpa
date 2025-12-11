package com.company.ex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.ex.entities.Product;

// Optional
@Repository 
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
