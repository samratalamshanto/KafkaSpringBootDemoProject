package com.example.demospringkafka.kafka.controller;

import com.example.demospringkafka.kafka.model.OrderModel;
import com.example.demospringkafka.kafka.service.KafkaOrderProducerService;
import com.example.demospringkafka.kafka.service.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/kafka")
public class KafkaMessageController {
    private final KafkaProducerService kafkaProducerService;
    private final KafkaOrderProducerService kafkaOrderProducerService;

    public KafkaMessageController(KafkaProducerService kafkaProducerService, KafkaOrderProducerService kafkaOrderProducerService) {
        this.kafkaProducerService = kafkaProducerService;
        this.kafkaOrderProducerService = kafkaOrderProducerService;
    }


    @PostMapping("/publishMessage")
    public ResponseEntity<String> publishMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
        return ResponseEntity.ok("Message sent successfully");
    }

    @PostMapping("/publishOrderModel")
    public ResponseEntity<String> publishOrderModel(@RequestBody OrderModel orderModel) {
        kafkaOrderProducerService.sendOrderMessage(orderModel);
        return ResponseEntity.ok("Message sent successfully");
    }
}
