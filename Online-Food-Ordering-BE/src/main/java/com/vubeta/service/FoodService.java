package com.vubeta.service;

import java.util.List;

import com.vubeta.model.Category;
import com.vubeta.model.Food;
import com.vubeta.model.Restaurant;
import com.vubeta.request.CreateFoodRequest;

public interface FoodService {
	public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);
	
	void deleteFood(Long foodId) throws Exception;
	
	public List<Food> getRestaurantsFood(Long restaurantId, 
										boolean isVegitarain, 
										boolean isNonveg, 
										boolean isSeasonal, 
										String foodCategory
										);
	
	public List<Food> searchFood(String keyword);
	public Food findFoodById(Long foodId) throws Exception;
	
	public Food updateAvailabilityStatus(Long foodId) throws Exception;
}
