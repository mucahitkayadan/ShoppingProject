package com.shopping.lab3.controller;

import com.shopping.lab3.domain.Product;
import com.shopping.lab3.domain.WebshopAdministrator;
import com.shopping.lab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

    public void addProduct(Product product) {
    }

    public void removeProduct(Product product) {

    }

    public void updateProduct(Product product) {

    }
}