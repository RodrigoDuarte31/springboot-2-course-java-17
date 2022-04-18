package com.rodrigo.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.projetospring.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long> {
	
	

}
