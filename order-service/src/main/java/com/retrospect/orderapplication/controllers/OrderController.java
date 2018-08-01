package com.retrospect.orderapplication.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.retrospect.orderapplication.models.Order;
import com.retrospect.orderapplication.services.OrderService;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "v1/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue helloQueue;

    @RequestMapping(value = "/second-service", method = RequestMethod.GET)
    public String secondService() {
        return orderService.getFromSecondService();
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public Order createOrder(@RequestBody Order order) throws JsonProcessingException {
        order.setOrderId(java.util.UUID.randomUUID().toString());
        return orderService.saveOrder(order);

        /*this.template.convertAndSend(helloQueue.getName(),  mapper.writer().withDefaultPrettyPrinter().writeValueAsString(order));
        return mapper.writer().withDefaultPrettyPrinter().writeValueAsString(order);*/
    }

    @RequestMapping("/")
    public List<Order> getAllOrder() {
        return orderService.getAllOrders();
    }

    @RequestMapping("/{orderId}")
    public Order getOrder(@PathVariable String orderId) {
        return orderService.getOrderById(orderId);
    }



}
