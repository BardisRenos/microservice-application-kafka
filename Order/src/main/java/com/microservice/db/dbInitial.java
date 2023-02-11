package com.microservice.db;

import com.microservice.dao.OrderRepository;
import com.microservice.entity.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class dbInitial {

    @Bean
    public CommandLineRunner initDB(OrderRepository orderRepository) {

        return args -> {

            List<Order> orders = new ArrayList<>(Arrays.asList(
                    new Order(1, "Renos", "Bread", "Butter", 5.0),
                    new Order(2, "Nikos", "Milk", "Cafe" , 3.5),
                    new Order(3, "Andreas", "Chips", "Water", 8.0)));

            orderRepository.saveAll(orders);

        };
    }
}
