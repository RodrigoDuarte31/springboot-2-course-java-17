package com.rodrigo.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.projetospring.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long> {
	
	

}
