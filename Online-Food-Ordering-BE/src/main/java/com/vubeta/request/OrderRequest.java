package com.vubeta.request;

import com.vubeta.model.Address;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {
	Long restaurantId;
	Address deliveryAddress;
}
