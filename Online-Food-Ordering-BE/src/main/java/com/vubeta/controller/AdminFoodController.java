package com.vubeta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vubeta.model.Food;
import com.vubeta.model.Restaurant;
import com.vubeta.model.User;
import com.vubeta.request.CreateFoodRequest;
import com.vubeta.response.MessageResponse;
import com.vubeta.service.FoodService;
import com.vubeta.service.RestaurantService;
import com.vubeta.service.UserService;

@RestController
@RequestMapping("/api/admin/food")
public class AdminFoodController {
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestaurantService restaurantService;
	
	@PostMapping
	public ResponseEntity<Food> createFood(@RequestBody CreateFoodRequest req, 
										@RequestHeader("Authorization") String jwt) throws Exception {
		User user = userService.findUserByJwtToken(jwt);
		Restaurant restaurant = restaurantService.findRestaurantById(req.getRestaurantId());
		Food food = foodService.createFood(req, req.getCategory(), restaurant);
		
		return new ResponseEntity<>(food, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<MessageResponse> deleteFood(@PathVariable("id") Long id, 
										@RequestHeader("Authorization") String jwt) throws Exception {
		User user = userService.findUserByJwtToken(jwt);
		
		foodService.deleteFood(id);
		
		MessageResponse res = new MessageResponse();
		res.setMessage("food deleted successfully");
		
		return new ResponseEntity<>(res, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Food> updateFoodAvailabilityStatus(@PathVariable("id") Long id, 
										@RequestHeader("Authorization") String jwt) throws Exception {
		User user = userService.findUserByJwtToken(jwt);
		
		Food food = foodService.updateAvailabilityStatus(id);
		
		return new ResponseEntity<>(food, HttpStatus.CREATED);
	}
}
