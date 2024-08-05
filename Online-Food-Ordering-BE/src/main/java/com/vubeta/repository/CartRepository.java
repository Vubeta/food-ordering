package com.vubeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vubeta.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	
}
