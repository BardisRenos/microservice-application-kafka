package com.microservice.kafkaConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice.ProducerEntity.Order;
import com.microservice.service.StoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Consumer {

    private static final String orderTopic = "${topic.name}";

    private final StoreService storeService;
    private final ObjectMapper objectMapper;


    @KafkaListener(topics = orderTopic)
    public void consumeMessageFromOrder(String message) throws JsonProcessingException {
        log.info("The message: "+ message);

        Order order = objectMapper.readValue(message, Order.class);

        log.info("The order has id : {} and the client name is : {}", order.getOrderId(), order.getClientName());
    }
}
