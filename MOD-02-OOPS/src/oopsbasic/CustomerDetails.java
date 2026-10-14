//CustomerDetails with Objects, set & print methods and instance variables
//Customer Management System

package oopsbasic;

import java.util.Scanner;

class Customer {

    int customerId;
    String customerName;
    String email;
    float purchaseAmount;

    // Method to set customer details
    public void setDetails(int id, String name, String mail, float amount) {
        customerId = id;
        customerName = name;
        email = mail;
        purchaseAmount = amount;
    }

    // Method to print customer details
    public void printDetails() {
        System.out.println("Customer ID: " + customerId +
                " | Customer Name: " + customerName +
                " | Email: " + email +
                " | Purchase Amount: " + purchaseAmount);
    }
}

//Main class
public class CustomerDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String mail;
        float amount;

        // ---------------------------- 1st Entry -------------------------------

        System.out.println("Enter the Customer ID:");
        id = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.println("Enter the Customer Name:");
        name = sc.nextLine();

        System.out.println("Enter the Customer Email:");
        mail = sc.nextLine();

        System.out.println("Enter the Purchase Amount:");
        amount = sc.nextFloat();

        Customer customerOne = new Customer();
        customerOne.setDetails(id, name, mail, amount);

        // ---------------------------- 2nd Entry -------------------------------

        System.out.println("\nEnter the Customer ID:");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Customer Name:");
        name = sc.nextLine();

        System.out.println("Enter the Customer Email:");
        mail = sc.nextLine();

        System.out.println("Enter the Purchase Amount:");
        amount = sc.nextFloat();

        Customer customerTwo = new Customer();
        customerTwo.setDetails(id, name, mail, amount);

        // ---------------------------- Output -------------------------------

        System.out.println("\n--- Customer Details ---");
        customerOne.printDetails();
        customerTwo.printDetails();

        sc.close();
    }
}
