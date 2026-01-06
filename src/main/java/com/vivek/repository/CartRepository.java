package com.vivek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
