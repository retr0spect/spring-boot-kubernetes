package com.retrospect.orderapplication.repositories;

import com.retrospect.orderapplication.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order, String> {

    Order findByOrderId(String orderId);
}
