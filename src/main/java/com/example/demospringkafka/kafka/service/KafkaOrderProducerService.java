package com.example.demospringkafka.kafka.service;

import com.example.demospringkafka.kafka.model.OrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaOrderProducerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaOrderProducerService.class);
    private final KafkaTemplate<String, OrderModel> kafkaTemplate;

    public KafkaOrderProducerService(KafkaTemplate<String, OrderModel> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrderMessage(OrderModel orderModel) {
        logger.info(String.format("Order Message Sent : %s", orderModel.toString()));
        Message<OrderModel> message = MessageBuilder.withPayload(orderModel)
                .setHeader(KafkaHeaders.TOPIC, "newTopicJson")
                .build();

        kafkaTemplate.send(message);

    }
}
