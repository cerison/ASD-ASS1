package edu.miu.cs.cs489.lab1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ProductMgtclass {
    public static void main(String[] args) {
        System.out.println("Hello product management app");

        // Product[] products = new Product[3];

        Product[] products = new Product[] {
                new Product(3128874119L, "Banana", LocalDate.of(2023, 01, 24), 124, 0.55),
                new Product(2927458265L, "Apple", LocalDate.of(2022, 12, 9), 18, 1.09),
                new Product(9189927460L, "Carrot", LocalDate.of(2023, 03, 31), 89, 2.99)
        };
        Arrays.sort(products, Comparator.comparing(Product::getName));

        printProduct(products);
    }

    public static void printProduct(Product[] products) {
        System.out.println("[");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("]");

    }
}
