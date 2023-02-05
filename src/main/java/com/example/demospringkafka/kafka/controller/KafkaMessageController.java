package com.example.demospringkafka.kafka.controller;

import com.example.demospringkafka.kafka.service.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/kafka")
public class KafkaMessageController {
    private final KafkaProducerService kafkaProducerService;

    public KafkaMessageController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }


    @PostMapping("/publishMessage")
    public ResponseEntity<String> publishMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
        return ResponseEntity.ok("Message sent successfully");
    }
}
