package com.shopping.lab3.service;

import com.shopping.lab3.domain.Customer;
import com.shopping.lab3.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final CustomerRepository customerRepository;

    public UserService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createUser(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

    // other service methods
}