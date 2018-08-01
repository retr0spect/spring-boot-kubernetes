package com.retrospect.orderapplication.models;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    String orderId;
    List<LineItem> lineItems;
    Customer sellToCustomer;



    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public Customer getSellToCustomer() {
        return sellToCustomer;
    }

    public void setSellToCustomer(Customer sellToCustomer) {
        this.sellToCustomer = sellToCustomer;
    }
}
