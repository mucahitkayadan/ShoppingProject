package com.shopping.lab3.domain;

import java.util.List;

public class Supplier {
    private String supplierName;
    private String contactInfo;
    private List<Product> productsSupplied;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Product> getProductsSupplied() {
        return productsSupplied;
    }

    public void setProductsSupplied(List<Product> productsSupplied) {
        this.productsSupplied = productsSupplied;
    }
}
