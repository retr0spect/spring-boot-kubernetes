package com.retrospect.orderapplication.models;

import java.io.Serializable;

public class Customer implements Serializable {
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
