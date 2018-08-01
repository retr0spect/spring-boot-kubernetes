package com.retrospect.orderapplication.repositories;

import com.retrospect.orderapplication.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class OrderRedisRepoImpl implements OrderRedisRepo {
    private static final String HASH_NAME = "Order";

    private RedisTemplate<String, Order> redisTemplate;
    private HashOperations hashOperations;

    public OrderRedisRepoImpl() {
        super();
    }

    @Autowired
    private OrderRedisRepoImpl(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init() {
        hashOperations = redisTemplate.opsForHash();
    }


    @Override
    public void saveOrder(Order order) {
        hashOperations.put(HASH_NAME, order.getOrderId(), order);
    }

    @Override
    public void deleteOrder(String OrderId) {
        hashOperations.delete(HASH_NAME, OrderId);
    }

    @Override
    public Order findOrder(String OrderId) {
        Order order = (Order) hashOperations.get(HASH_NAME, OrderId);
        order.setOrderId(order.getOrderId() + "_FromRedis");
        return order;
    }
}
