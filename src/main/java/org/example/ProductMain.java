package org.example;

public class ProductMain {
    public static void main(String[] args) {
        // Instantiate a Product object
        Product product = new Product("Gallon of gas", 4.0, 10);

        // Call the printProduct method to print product details
        product.printProduct();

        // Call the totalCost method to print the total cost
        product.totalCost();
    }
}
