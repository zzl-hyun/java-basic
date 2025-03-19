package com.helloshop.order;

import com.helloshop.user.*;
import com.helloshop.product.*;
public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
