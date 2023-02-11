package com.microservice.ProducerEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

        private Integer orderId;
        private String clientName;
        private String item1;
        private String item2;
        private Double total;
}
