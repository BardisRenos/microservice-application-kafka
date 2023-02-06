package com.microservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microservice.dao.OrderRepository;
import com.microservice.entity.Order;
import com.microservice.kafkaConfig.Producer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    
    private final OrderRepository orderRepository;
    private final Producer producer;


    public List<Order> findAll() {

        return orderRepository.findAll();
    }

    public String createAccount(Order order) throws JsonProcessingException {

        log.info("Sending an event message to Store");

        return producer.sendMessage(order);
//        return orderRepository.save(order);
    }
}
