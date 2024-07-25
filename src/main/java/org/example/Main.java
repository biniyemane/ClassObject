package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instantiate a BankAccount object with 500 dollars
        BankAccount myAccount = new BankAccount("Teklu deyas", 500);
        // Create the first account with 5000 dollars
        BankAccount account1 = new BankAccount("Larry", 5000);

        // Create the second account with 300 dollars
        BankAccount account2 = new BankAccount("Mary", 300);

        // Deposit 100 dollars into the account
        myAccount.deposit(100);

        // Withdraw 100 dollars from the first account
        account1.withdraw(100);

        // Deposit 100 dollars in the second account
        account2.deposit(100);

        // Print the account details
        myAccount.printAccountDetails();
        account1.printAccountDetails2();
        account2.printAccountDetails2();
    }
}