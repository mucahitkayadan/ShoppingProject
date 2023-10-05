package com.shopping.lab3.repository;

import com.shopping.lab3.domain.Customer;
import com.shopping.lab3.domain.Order;
import com.shopping.lab3.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCartRepository {
    Map<String, Order> orders = new HashMap<>();

    public Collection<Order> findAllOrders() {
        return null;
    }

    public void addOrder(Order order) {

    }

    public void removeOrder(Order order) {

    }
}
