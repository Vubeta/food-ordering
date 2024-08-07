package com.vubeta.request;

import java.util.List;

import com.vubeta.model.Category;
import com.vubeta.model.IngredientsItem;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateFoodRequest {
	String name;
	String description;
	Long price;
	
	Category category;
	List<String> images;
	
	Long restaurantId;
	boolean vegetarin;
	boolean seasional;
	List<IngredientsItem> ingredients;
}
