package com.example.demospringkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringKafkaApplication.class, args);
        System.out.println("Done.");
    }

}
