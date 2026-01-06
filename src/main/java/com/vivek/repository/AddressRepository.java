package com.vivek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
