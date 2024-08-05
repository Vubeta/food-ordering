package com.vubeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vubeta.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
}
