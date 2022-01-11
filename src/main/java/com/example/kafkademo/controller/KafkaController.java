package com.example.kafkademo.controller;


import com.example.kafkademo.services.ConsumerService;
import org.springframework.web.bind.annotation.*;

import com.example.kafkademo.services.ProducerService;

@RestController
@RequestMapping("/kafka")
public final class KafkaController {
    private final ProducerService producerService;


    public KafkaController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam String message) {
        producerService.sendMessage(message);
    }

}