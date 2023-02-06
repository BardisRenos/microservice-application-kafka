package com.microservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    @Column(name = "client_name")
    private String clientName;
    @Column(name = "item_1")
    private String item1;
    @Column(name = "item_2")
    private String item2;
    @Column(name = "total")
    private Double total;

}
