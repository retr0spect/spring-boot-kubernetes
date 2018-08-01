package com.retrospect.orderapplication.models;

import java.io.Serializable;

public class LineItem implements Serializable {
    String sku;
    int quantity;

    public LineItem() {}

    public LineItem(String sku, int quantity) {
        this.sku = sku;
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
