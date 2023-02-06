package com.example.demospringkafka.kafka.service;

import com.example.demospringkafka.kafka.model.OrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaOrderConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(KafkaOrderConsumerService.class);

    @KafkaListener(topics = "newTopicJson", groupId = "sasGroup")
    public void kafkaJsonConsume(OrderModel orderModel) {
        logger.info(String.format("Message received: %s", orderModel.toString()));
    }
}
