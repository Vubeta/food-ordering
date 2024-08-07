package com.vubeta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vubeta.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	public List<Category> findByRestaurantId(Long id);
}
