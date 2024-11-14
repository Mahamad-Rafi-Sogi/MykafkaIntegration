package com.kafka.rafi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RafiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RafiApplication.class, args);
    }
}