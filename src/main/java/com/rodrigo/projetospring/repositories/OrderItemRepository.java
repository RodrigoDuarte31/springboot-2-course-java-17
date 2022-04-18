package com.rodrigo.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.projetospring.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {
	
	

}
