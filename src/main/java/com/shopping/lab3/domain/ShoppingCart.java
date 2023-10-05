package com.shopping.lab3.domain;

import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public void addProduct(Product product, int quantity) {
        // Logic to add products to the cart
    }

    public void removeProduct(Product product, int quantity) {
        // Logic to remove products from the cart
    }

    public Order placeOrder(Customer customer, CreditCard creditCard,
                            Address shippingAddress, Address billingAddress,
                            String shippingMethod) {
        // Logic to place an order
        return new Order();
    }

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
