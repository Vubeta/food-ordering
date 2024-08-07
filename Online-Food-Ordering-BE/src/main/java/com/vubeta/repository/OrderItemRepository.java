package com.vubeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vubeta.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
