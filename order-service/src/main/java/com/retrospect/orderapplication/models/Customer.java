package com.retrospect.orderapplication.models;

public class Customer {
    long customerId;
    String customerName;

    public Customer() {

    }

    public Customer(long customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
