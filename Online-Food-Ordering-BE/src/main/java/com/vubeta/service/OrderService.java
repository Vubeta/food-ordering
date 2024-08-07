package com.vubeta.service;

import java.util.List;

import com.vubeta.model.Order;
import com.vubeta.model.User;
import com.vubeta.request.OrderRequest;

public interface OrderService {
	
	public Order createOrder(OrderRequest order, User user) throws Exception;
	
	public Order updateOrder(Long orderId, String orderStatus) throws Exception;
	
	public void cancalOrder(Long orderId) throws Exception;
	
	public List<Order> getUsersOrder(Long userId) throws Exception;
	
	public List<Order> getRestaurantsOrder(Long restaurantId, String orderStatus) throws Exception;
}