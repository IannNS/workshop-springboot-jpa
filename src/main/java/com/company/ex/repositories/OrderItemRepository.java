package com.company.ex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.ex.entities.OrderItem;

// Optional
@Repository 
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
