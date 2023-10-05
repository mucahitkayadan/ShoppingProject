package com.shopping.lab3.repository;

import com.shopping.lab3.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
   Map<String, Product> products = new HashMap<>();

   public Collection<Product> findAllProducts() {
       return null;
   }

   public void addProduct(Product product) {

   }

    public void removeProduct(Product product) {

    }

}
