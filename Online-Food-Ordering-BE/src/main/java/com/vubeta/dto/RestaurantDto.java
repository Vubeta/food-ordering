package com.vubeta.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
public class RestaurantDto {
	
	String title;
	
	@Column(length = 1000)
	List<String> images;
	
	String description;
	Long id;
}
