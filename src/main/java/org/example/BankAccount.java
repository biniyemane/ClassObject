package org.example;

public class BankAccount {
    private double balance;
    private String accountHolderName;

    // Constructor to initialize account holder's name and balance
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to print the account details
    public void printAccountDetails() {
        System.out.println("My Account balance: " + balance);
    }
    // Method to print the account details
    public void printAccountDetails2() {
        System.out.println(accountHolderName + "'s account balance: " + balance);
    }
}
