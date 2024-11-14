package com.kafka.rafi.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	private final List<String> messages = new ArrayList<>();
	
	
    @KafkaListener(topics = "MyTopic", groupId = "my-group")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
        messages.add(message);
        // Add processing logic here
    }

    public void clearMessages() {
        messages.clear();  // Clear after reading, if needed
    }

	public List<String> getMessages() {
		// TODO Auto-generated method stub
		return new ArrayList<>(messages);
	}
}