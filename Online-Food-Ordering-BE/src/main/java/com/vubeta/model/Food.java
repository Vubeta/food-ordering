package com.vubeta.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String name;
	
	String description;
	
	Long price;
	
	@ManyToOne
	Category foodCategory;
	
	@Column(length = 1000)
	@ElementCollection
	List<String> images;
	
	boolean available;
	
	@ManyToOne
	Restaurant restaurant;
	
	boolean isVegetarian;
	boolean isSeasonal;
	
	@ManyToMany
	List<IngredientsItem> ingredients = new ArrayList<>();
	
	Date creationDate;
}
