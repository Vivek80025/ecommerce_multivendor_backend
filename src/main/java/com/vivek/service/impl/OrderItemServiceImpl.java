package com.vivek.service.impl;

import com.vivek.exception.OrderException;
import com.vivek.model.OrderItem;
import com.vivek.repository.OrderItemRepository;
import com.vivek.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {


    private final OrderItemRepository orderItemRepository;


    @Override
    public OrderItem getOrderItemById(Long id) throws Exception {

        System.out.println("------- "+id);
        Optional<OrderItem> orderItem = orderItemRepository.findById(id);
        if(orderItem.isPresent()){
            return orderItem.get();
        }
        throw new OrderException("Order item not found");
    }
}
