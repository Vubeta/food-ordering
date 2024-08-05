package com.vubeta.response;

import com.vubeta.model.USER_ROLE;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthResponse {
	String jwt;
	String message;
	USER_ROLE role;
}
