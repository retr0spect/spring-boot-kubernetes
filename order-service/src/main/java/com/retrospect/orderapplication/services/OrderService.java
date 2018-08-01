package com.retrospect.orderapplication.services;

import com.retrospect.orderapplication.clients.SecondServiceClient;
import com.retrospect.orderapplication.models.Order;
import com.retrospect.orderapplication.repositories.OrderRedisRepoImpl;
import com.retrospect.orderapplication.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SecondServiceClient secondServiceClient;

    @Autowired
    OrderRedisRepoImpl orderRedisRepo;

    public String getFromSecondService() {
        return secondServiceClient.getFromSecondService();
    }

    public Order saveOrder(Order order) {
        orderRedisRepo.saveOrder(order);
        return orderRepo.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Order getOrderById(String orderId) {
        Order order = orderRedisRepo.findOrder(orderId);
        if (order == null) {
            order = orderRepo.findByOrderId(orderId);
        }
        return order;
    }
}
