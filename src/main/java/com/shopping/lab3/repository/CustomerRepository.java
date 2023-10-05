package com.shopping.lab3.repository;

import com.shopping.lab3.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Additional custom query methods can be defined here if needed
}