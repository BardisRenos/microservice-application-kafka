package com.microservice.controller;

import com.microservice.entity.Order;
import com.microservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/order/")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    @PostMapping("insert")
    @ResponseStatus(HttpStatus.CREATED)
    public Order insertOrder(@RequestBody Order order) {
        return orderService.createAccount(order);
    }
}
