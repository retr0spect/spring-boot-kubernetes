package com.retrospect.orderapplication.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.retrospect.orderapplication.models.Order;
import com.retrospect.orderapplication.services.TheService;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class OrderController {

    @Autowired
    TheService theService;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue helloQueue;

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public Object createOrder(@RequestBody Order order) throws JsonProcessingException {
        this.template.convertAndSend(helloQueue.getName(),  mapper.writer().withDefaultPrettyPrinter().writeValueAsString(order));
        return mapper.writer().withDefaultPrettyPrinter().writeValueAsString(order);
    }



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloSpring() {
        return "Hello Spring Boot";
    }

    @RequestMapping(value = "/second-service", method = RequestMethod.GET)
    public String secondService() {
        return theService.getFromSecondService();
    }

}
