package com.shopping.lab3.repository;

import com.shopping.lab3.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional custom query methods can be defined here if needed
}
