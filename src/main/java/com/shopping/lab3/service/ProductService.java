package com.shopping.lab3.service;

import com.shopping.lab3.domain.Product;
import com.shopping.lab3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Collection<Product> getAllProducts() {
        return productRepository.findAllProducts();
    }

    public void addProduct(Product product) {

    }

    public void removeProduct(Product product) {

    }
}
