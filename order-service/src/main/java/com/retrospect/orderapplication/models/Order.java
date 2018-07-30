package com.retrospect.orderapplication.models;

import java.util.List;

public class Order {
    long orderNumber;
    List<LineItem> lineItems;
    Customer sellToCustomer;

    public Order() {
    }

    public Order(long orderNumber, List<LineItem> lineItems, Customer sellToCustomer) {
        this.orderNumber = orderNumber;
        this.lineItems = lineItems;
        this.sellToCustomer = sellToCustomer;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
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
