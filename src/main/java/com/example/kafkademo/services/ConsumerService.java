package com.example.kafkademo.services;

import com.example.kafkademo.model.Login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public final class ConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "login_topic", groupId = "javaApp")
    public void consume(Login message) {
        logger.info(message.getUser()+" " +message.getDate());
    }
}