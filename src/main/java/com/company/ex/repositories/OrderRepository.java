package com.company.ex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.ex.entities.Order;

// Optional
@Repository 
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
