package com.vubeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vubeta.model.Category;
import com.vubeta.repository.CategoryRepository;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category createCategory(String name, Long userId) {
//		Restaurant restaurant = restaurantService.findRestaurantById(userId);
//		Category
		return null;
	}

	@Override
	public List<Category> findCategoryByRestaurantId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findCategoryById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
