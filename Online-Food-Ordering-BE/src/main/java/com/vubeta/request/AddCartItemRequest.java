package com.vubeta.request;

import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddCartItemRequest {
	Long foodId;
	
	int quantity;
	
	List<String> ingredients;
}
