package com.kafka.rafi.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
	
	@Bean
	public NewTopic mytopic() {
		return new NewTopic("MyTopic", 1, (short) 1);
	}
	
}
