package com.microservice.kafkaConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice.entity.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {

    @Value("${topic.name}")
    private String ORDER_TOPIC;

    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(Order order) throws JsonProcessingException {
        String orderAsMessage = objectMapper.writeValueAsString(order);
        kafkaTemplate.send(ORDER_TOPIC, orderAsMessage);

        log.info("The order is produced and sent {}", orderAsMessage);

        return "message sent to consumer";
    }
}
