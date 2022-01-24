package com.company;

import enums.ProductCategory;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Product product0 = new Product("Духи", 12.5D, "лавандовые", ProductCategory.PARFUMERY);
        Product product1 = new Product("крем для рук", 15.35D, "увлажняющий", ProductCategory.COSMETICS);
        Product product2 = new Product("свитер", 35.65D, "шерстяной", ProductCategory.CLOTHING);
        Product product3 = new Product("сумочка", 355.05D, "кожаная", ProductCategory.ACCESSORIES);
        Product product4 = new Product("ботинки", 125.32D, "мужские", ProductCategory.FOOTWEAR);
        Product product5 = new Product("сапожки", 385.96D, "женские", ProductCategory.FOOTWEAR);
        Product product6 = new Product("Samsung", 215.77D, "galaxy_7", ProductCategory.PHONES);
        Product product7 = new Product("IPhone", 554.21D, "SE_12", ProductCategory.PHONES);
        Product product8 = new Product("ремень", 115.05D, "мужской", ProductCategory.ACCESSORIES);

        Product[] myProducts = new Product[]{
                product0, product1, product2, product3, product4, product5, product6, product7, product8
        };

        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(myProducts));
        }
        System.out.println("\n");

        Product[][] newProducts = new Product[][]{
                {product3, product8},
                {product4, product5},
                {product6, product7},
                {product1},
                {product2}
        };

        for (int i = 0; i < newProducts.length; i++){
            for (int j = 0; j < newProducts[i].length; j++)
            {
                System.out.println(newProducts [i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
