package com.vubeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vubeta.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String username);
}
