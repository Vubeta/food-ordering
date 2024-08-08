package com.vubeta.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@ManyToOne
	User customer;
	
	@JsonIgnore
	@ManyToOne
	Restaurant restaurant;
	
	Long totalAmount;
	
	String orderStatus;
	
	Date createdAt;
	
	@ManyToOne
	Address deliveryAddress;
	
	@OneToMany
	List<OrderItem> items;
	
//	Payment payment;
	
	int totalItem;
	
	Long totalPrice;
}
