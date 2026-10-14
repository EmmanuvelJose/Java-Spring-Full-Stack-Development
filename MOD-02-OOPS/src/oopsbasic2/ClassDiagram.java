//Bank Account Management 

package oopsbasic2;

import java.util.Scanner;

// Account class represents a bank account
class Account {
    int accountNumber;   // stores account number
    double balance = 0.0; // stores account balance (default 0)

    // Constructor to initialize account number and balance
    Account(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    // Constructor to initialize only account number (balance remains 0)
    Account(int accNo) {
        accountNumber = accNo;
    }

    // Getter method to return account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter method to return current balance
    public double getBalance() {
        return balance;
    }

    // Setter method to update balance
    public void setBalance(double bal) {
        balance = bal;
    }

    // Method to deposit (credit) amount into account
    public void credit(double amount) {
        if (amount > 0) {  // check for valid amount
            balance += amount;  // add amount to balance
            System.out.println("Amount credited successfully.");
        } else {
            System.out.println("Invalid credit amount.");
        }
    }

    // Method to withdraw (debit) amount from account
    public void debit(double amount) {
        // check if amount is valid and balance is sufficient
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // subtract amount from balance
            System.out.println("Amount debited successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // toString method to display account details
    public String toString() {
        return "Account Number: " + accountNumber +
               ", Balance: " + balance;
    }
}

// Main class
public class ClassDiagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        // Taking account number input from user
        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();

        // Taking initial balance input from user
        System.out.println("Enter Initial Balance:");
        double bal = sc.nextDouble();

        // Creating Account object using constructor
        Account account = new Account(accNo, bal);

        int choice; // variable to store user menu choice

        // Menu-driven loop (runs until user selects Exit)
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Show Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt(); // read user choice

            // Switch case to perform operations based on choice
            switch (choice) {
                case 1:
                    // Credit operation
                    System.out.print("Enter amount to credit: ");
                    double creditAmt = sc.nextDouble();
                    account.credit(creditAmt); // call credit method
                    break;

                case 2:
                    // Debit operation
                    System.out.print("Enter amount to debit: ");
                    double debitAmt = sc.nextDouble();
                    account.debit(debitAmt); // call debit method
                    break;

                case 3:
                    // Display current balance
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 4:
                    // Display full account details using toString()
                    System.out.println(account);
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;

                default:
                    // Invalid input handling
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5); // loop until user selects Exit

        sc.close(); // close scanner to prevent resource leak
    }
}