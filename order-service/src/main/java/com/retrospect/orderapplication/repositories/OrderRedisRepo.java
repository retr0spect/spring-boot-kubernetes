package com.retrospect.orderapplication.repositories;

import com.retrospect.orderapplication.models.Order;

public interface OrderRedisRepo {
    void saveOrder(Order org);
    void deleteOrder(String orderId);
    Order findOrder(String orderId);
}
