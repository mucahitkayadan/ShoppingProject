package com.shopping.lab3.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productNumber;
    private String name;
    private double price;
    private String description;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

    @OneToOne(mappedBy = "product")
    private StockInfo stockInfo;

    @ManyToOne
    private SupplierEntity supplier;

    public Product() {
        // No-argument constructor
    }

    public Product(String productNumber, String name, double price, String description, List<Review> reviews, StockInfo stockInfo, SupplierEntity supplier) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.description = description;
        this.reviews = reviews;
        this.stockInfo = stockInfo;
        this.supplier = supplier;
    }

    // Constructors, getters, and setters
}