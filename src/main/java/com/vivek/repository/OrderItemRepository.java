package com.vivek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
