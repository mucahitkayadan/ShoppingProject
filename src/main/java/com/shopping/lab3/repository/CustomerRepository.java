package com.shopping.lab3.repository;

import com.shopping.lab3.domain.Customer;
import com.shopping.lab3.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepository {
    Map<String, Customer> customers = new HashMap<>();

    public Collection<Product> findAllCustomers() {
        return null;
    }

    public void addCustomer(Customer customer) {

    }

    public void removeCustomer(Customer customer) {

    }
}