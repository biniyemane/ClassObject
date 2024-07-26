package org.example;
import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String accountHolderName;
    private int accountNumber;
    private static int nextAccountNumber = 1000;

    // Constructor to initialize account holder's name, balance, and account number
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = nextAccountNumber++;
    }

    // No-parameter constructor for user input
    public BankAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the name for the account? ");
        this.accountHolderName = scanner.nextLine();

        System.out.print("What is the beginning balance for the account? ");
        this.balance = Double.parseDouble(scanner.nextLine());

        this.accountNumber = nextAccountNumber++;
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

    // Method to transfer money to another account
    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            toAccount.deposit(amount);
        }
    }

    // Method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Method to print the account details
    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }
}

