package com.rodrigo.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.projetospring.entities.User;

public interface UserRepository  extends JpaRepository<User, Long> {
	
	

}
