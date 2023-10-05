package com.shopping.lab3.controller;

import com.shopping.lab3.domain.Customer;
import com.shopping.lab3.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController() {
        this.customerService = new CustomerService();
    }
@PostMapping("/")
    public void createCustomer(Customer customer) {
        customerService.createCustomer(customer);
    }
@GetMapping("/")
    public void updateCustomer(Customer customer) {
        customerService.updateCustomer(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerService.deleteCustomer(customer);
    }

    public Customer getCustomerById(String customerNumber) {
        return customerService.getCustomerByNumber(customerNumber);
    }
}