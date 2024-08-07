package com.vubeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vubeta.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
