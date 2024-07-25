package org.example;

public class Product {
    private double productCost;
    private int quantity;
    private String productName;

    // Constructor to initialize product name, cost, and quantity
    public Product(String productName, double productCost, int quantity) {
        this.productName = productName;
        this.productCost = productCost;
        this.quantity = quantity;
    }

    // Method to calculate and print the total cost
    public void totalCost() {
        double total = productCost * quantity;
        System.out.println("Total cost is " + total);
    }

    // Method to print product details
    public void printProduct() {
        System.out.println(productName + " costs " + productCost + " and " + quantity + " units were purchased.");
    }
}

