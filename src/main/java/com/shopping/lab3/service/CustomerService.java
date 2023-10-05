package com.shopping.lab3.service;

import com.shopping.lab3.domain.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public void createCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer created: " + customer.getFullName());
    }

    public void updateCustomer(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (Objects.equals(customers.get(i).getCustomerNumber(), customer.getCustomerNumber())) {
                customers.set(i, customer);
                System.out.println("Customer updated: " + customer.getFullName());
                return;
            }
        }
        System.out.println("Customer not found");
    }

    public void deleteCustomer(Customer customer) {
        if (customers.remove(customer)) {
            System.out.println("Customer deleted: " + customer.getFullName());
        } else {
            System.out.println("Customer not found");
        }
    }

    public Customer getCustomerByNumber(String customerNumber) {
        for (Customer customer : customers) {
            if (Objects.equals(customer.getCustomerNumber(), customerNumber)) {
                return customer;
            }
        }
        return null;
    }
}