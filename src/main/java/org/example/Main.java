package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        System.out.println("Hello world! Welcome to the Bank of Matt!");
        while (true) {
            System.out.println("Are you an existing customer? (-1 to exit)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == -1) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Please enter your account number: ");
                    int accountNumber = Integer.parseInt(scanner.nextLine());
                    BankAccount existingAccount = findAccount(accounts, accountNumber);
                    if (existingAccount != null) {
                        mainMenu(existingAccount, accounts, scanner);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 2:
                    System.out.println("Let's make a new account!");
                    BankAccount newAccount = new BankAccount();
                    accounts.add(newAccount);
                    newAccount.printAccountDetails();
                    mainMenu(newAccount, accounts, scanner);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static BankAccount findAccount(ArrayList<BankAccount> accounts, int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    private static void mainMenu(BankAccount account, ArrayList<BankAccount> accounts, Scanner scanner) {
        while (true) {
            System.out.println("\nHello " + account.getAccountHolderName() + "!");
            System.out.println("Welcome to the Main Menu, what would you like to do today?");
            System.out.println("1. To check account balance");
            System.out.println("2. To make a withdrawal");
            System.out.println("3. To make a deposit");
            System.out.println("4. To make a transfer to another account");
            System.out.println("0. To exit.");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Your account balance is: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    account.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful. New balance is: " + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance is: " + account.getBalance());
                    break;
                case 4:
                    System.out.print("Enter account number to transfer to: ");
                    int transferAccountNumber = Integer.parseInt(scanner.nextLine());
                    BankAccount toAccount = findAccount(accounts, transferAccountNumber);
                    if (toAccount != null) {
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = Double.parseDouble(scanner.nextLine());
                        account.transfer(toAccount, transferAmount);
                        System.out.println("Transfer successful. New balance is: " + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
