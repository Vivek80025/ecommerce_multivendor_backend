package com.vivek.repository;

import com.vivek.model.Cart;
import com.vivek.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
