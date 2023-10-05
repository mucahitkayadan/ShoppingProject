package com.shopping.lab3.controller;

import com.shopping.lab3.domain.Product;
import com.shopping.lab3.domain.WebshopAdministrator;

public class ProductController {
    private WebshopAdministrator webshopAdministrator;

    public ProductController() {
        this.webshopAdministrator = new WebshopAdministrator();
    }

    public void addProduct(Product product) {
        webshopAdministrator.addProduct(product);
    }

    public void removeProduct(Product product) {
        webshopAdministrator.removeProduct(product);
    }

    public void updateProduct(Product product) {
        webshopAdministrator.updateProduct(product);
    }
}