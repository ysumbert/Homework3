package com.company;

import enums.ProductCategory;

public class Product {
    String name;
    double price;
    String description;
    ProductCategory category;

    public Product(String name, double price, String description, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String toString() {
        return "Product{name='" + this.name + "', price=" + this.price + ", description='" + this.description + "', category=" + this.category + "}";
    }
}
