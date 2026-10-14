// EmployeeDetails with Objects, set & print methods and instance variables
// Employee Management System

package oopsbasic;

import java.util.Scanner;

class Employee {

    int empid;
    String empname;
    String department;
    float salary;

    // Method to set employee details
    public void setDetails(int id, String name, String depart, float sal) {

        empid = id;
        empname = name;
        department = depart;
        salary = sal;
    }

    // Method to print employee details
    public void printDetails() {

        System.out.println("Employee ID: " + empid +
                " | Employee Name: " + empname +
                " | Department: " + department +
                " | Salary: " + salary);
    }
}

// Main class
public class EmployeeDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String depart;
        float sal;

        // ---------------------------- 1st entry -------------------------------

        System.out.println("Enter the Employee ID:");
        id = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        System.out.println("Enter the Employee Name:");
        name = sc.nextLine();

        System.out.println("Enter the Department:");
        depart = sc.nextLine();

        System.out.println("Enter the Salary:");
        sal = sc.nextFloat();

        Employee employeeOne = new Employee();
        employeeOne.setDetails(id, name, depart, sal);

        // ---------------------------- 2nd entry -------------------------------

        System.out.println("\nEnter the Employee ID:");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Employee Name:");
        name = sc.nextLine();

        System.out.println("Enter the Department:");
        depart = sc.nextLine();

        System.out.println("Enter the Salary:");
        sal = sc.nextFloat();

        Employee employeeTwo = new Employee();
        employeeTwo.setDetails(id, name, depart, sal);

        // ---------------------------- Output -------------------------------

        System.out.println("\n--- Employee Details ---");
        employeeOne.printDetails();
        employeeTwo.printDetails();

        sc.close();
    }
}
