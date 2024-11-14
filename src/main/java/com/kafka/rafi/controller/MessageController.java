package com.kafka.rafi.controller;

import com.kafka.rafi.consumer.KafkaConsumer;
import com.kafka.rafi.producer.KafkaProducer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {
    private final KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public String publish(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return "Message sent to Kafka!";
    }
    
    @Autowired
    private KafkaConsumer kafkaConsumer;

    @GetMapping("/messages")
    public List<String> getMessages() {
        List<String> messages = kafkaConsumer.getMessages();
        //kafkaConsumer.clearMessages();  // Optionally clear after retrieval
        return messages;
    }
    
}