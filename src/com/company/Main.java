package com.company;

import enums.ProductCategory;

import java.util.ArrayList;

import static enums.ProductCategory.*;

public class Main {


    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product product0 = new Product("Духи", 12.5D, "лавандовые", PARFUMERY);
        Product product1 = new Product("крем для рук", 15.35D, "увлажняющий", COSMETICS);
        Product product2 = new Product("свитер", 35.65D, "шерстяной", CLOTHING);
        Product product3 = new Product("сумочка", 355.05D, "кожаная", ACCESSORIES);
        Product product4 = new Product("ботинки", 125.32D, "мужские", FOOTWEAR);
        Product product5 = new Product("ботинки", 385.96D, "женские", FOOTWEAR);
        Product product6 = new Product("Samsung", 215.77D, "galaxy_7", PHONES);
        Product product7 = new Product("IPhone", 554.21D, "SE_12", PHONES);
        Product product8 = new Product("ремень", 115.05D, "мужской", ACCESSORIES);

        products.add(product0);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);

        ArrayList<Product> categoryAccessories = new ArrayList<>();
        ArrayList<Product> categoryFootwear = new ArrayList<>();
        ArrayList<Product> categoryPhones = new ArrayList<>();
        ArrayList<Product> categoryCosmetics = new ArrayList<>();
        ArrayList<Product> categoryClothing = new ArrayList<>();
        ArrayList<Product> categoryParfumery = new ArrayList<>();

        int priceLow100Count = 0;
        int withShoesCount = 0;


        for (Product product : products){
            switch (product.category){
                case ACCESSORIES -> {
                    categoryAccessories.add(product);
                }
                case CLOTHING -> {
                    categoryClothing.add(product);
                }
                case COSMETICS -> {
                    categoryCosmetics.add(product);
                }
                case FOOTWEAR -> {
                    categoryFootwear.add(product);
                }
                case PARFUMERY -> {
                    categoryParfumery.add(product);
                }
                case PHONES -> {
                    categoryPhones.add(product);
                }
            }
            if (product.price < 100) {
                priceLow100Count = priceLow100Count +1;
            }
            if (product.name.contains("ботинки")){
                withShoesCount = withShoesCount +1;
            }
        }

        System.out.println(products + "\n");
        System.out.println(categoryAccessories + "\n");
        System.out.println(categoryClothing + "\n");
        System.out.println(categoryCosmetics + "\n");
        System.out.println(categoryFootwear + "\n");
        System.out.println(categoryParfumery + "\n");
        System.out.println(categoryPhones + "\n");
        System.out.println("Количество товара с ценой ниже 100: " + priceLow100Count + "\n");
        System.out.println("Количество товара с наименованием 'ботинки': " + withShoesCount + "\n");



       /* Product[] myProducts = new Product[]{
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
    */
    }







}
