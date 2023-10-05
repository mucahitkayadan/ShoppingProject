package com.shopping.lab3.controller;

import com.shopping.lab3.domain.Order;
import com.shopping.lab3.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "/shoppingcarts")
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;


    public Collection<Order> getAllOrders() {
        return null;
    }

    public void addOrder(@RequestBody Order order) {

    }

    public void removeOrder(@RequestBody Order order) {

    }
}
