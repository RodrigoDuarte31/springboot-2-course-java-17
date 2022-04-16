package com.rodrigo.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.projetospring.entities.Order;
import com.rodrigo.projetospring.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository userRepository; 
	
	public List<Order> findAll() {
		return userRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = userRepository.findById(id);
		return obj.get();
	}
	
}
