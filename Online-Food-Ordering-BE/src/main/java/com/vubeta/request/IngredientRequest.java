package com.vubeta.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IngredientRequest {
	
	String name;
	
	Long categoryid;
	
	Long restaurantId;

}
