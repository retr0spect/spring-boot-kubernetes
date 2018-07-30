package com.retrospect.orderprocessorapp.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

    @Bean
    public Queue hello() {
        return new Queue("hello-queue");
    }

    @Bean
    public Receiver receiver() {
        return new Receiver();
    }
}
