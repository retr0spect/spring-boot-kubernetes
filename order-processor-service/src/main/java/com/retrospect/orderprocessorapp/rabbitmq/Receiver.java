package com.retrospect.orderprocessorapp.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello-queue")
public class Receiver {

    @RabbitHandler
    public void receive(String order) {
        System.out.println(order);
    }

}
