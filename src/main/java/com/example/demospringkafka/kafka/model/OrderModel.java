package com.example.demospringkafka.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {
    private long id;
    private String foodName;
    private int quantity;
    private int price;
}
