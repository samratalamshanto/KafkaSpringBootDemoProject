package com.example.demospringkafka.kafka.cofig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    //NewTopic must be from kafka.clients.admin.NewTopic;
    @Bean
    public NewTopic createTopic(){
       return TopicBuilder.name("newTopic1")
               .partitions(10)
               .build();
    }
}
