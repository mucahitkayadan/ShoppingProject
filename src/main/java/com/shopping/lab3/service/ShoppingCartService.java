package com.shopping.lab3.service;

import com.shopping.lab3.domain.Customer;
import com.shopping.lab3.domain.Order;
import com.shopping.lab3.integration.EmailSender;
import com.shopping.lab3.repository.CustomerRepository;
import com.shopping.lab3.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ShoppingCartService {
    @Autowired
    ShoppingCartRepository shoppingCartRepository;
    @Autowired
    EmailSender emailSender;

    public Collection<Order> getAllOrders() {
        return shoppingCartRepository.findAllOrders();
    }

    public void addOrder(Order order) {
        shoppingCartRepository.addOrder(order);
        emailSender.sendEmail("email", "order");
    }

    public void removeOrder(Order order) {

    }
}