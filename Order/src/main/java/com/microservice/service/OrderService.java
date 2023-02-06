package com.microservice.service;

import com.microservice.dao.OrderRepository;
import com.microservice.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    
    private final OrderRepository orderRepository;


    public List<Order> findAll() {

        return orderRepository.findAll();
    }

    public Order createAccount(Order order) {

        return orderRepository.save(order);
    }
}
