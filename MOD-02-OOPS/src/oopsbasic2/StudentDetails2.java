// Student and Address Management (Composition)

package oopsbasic2;

import java.util.Scanner;  //imports Scanner class

//==========================================
//1. The Address Class (The Dependent Object)
//==========================================

class Address {
	
	// Instance variables (properties) of an Address
    String houseNo;
    String houseName;
    String residentialLane;
    String pincode;

    // A method to initialize the Address variables with the data passed to it
    public void setAddress(String hNo, String hName, String lane, String pin) {
        houseNo = hNo;
        houseName = hName;
        residentialLane = lane;
        pincode = pin;
    }

 // A method to print the address in a single, formatted line
    public void printAddress() {
        System.out.println("Address: " + houseNo + ", " + houseName + ", "
                + residentialLane + ", " + pincode);
    }
}

//==========================================
//2. The Student Class (The Main Object)
//==========================================

class Student2 {
	
	// Basic primitive properties of a student
    int rollNo;
    String name;
    float marks;
    
 // COMPOSITION: Here, the Student class uses the Address class as a data type.
 // This creates the "A Student HAS-A Address" relationship
    Address studentAddress;

 // A method to initialize all student details, INCLUDING the complex Address object
    public void setDetails(int ro, String n, float ma, Address add) {
        rollNo = ro;
        name = n;
        marks = ma;
        studentAddress = add;  // Important: We assign the fully built Address object to this student
    }

 // A method to print all details. Notice how it calls the Address class's print method!
    public void printDetails() {
        System.out.println("Roll No: " + rollNo + 
                           "  Name: " + name + 
                           "  Marks: " + marks);
        studentAddress.printAddress();// Triggers the print method from the Address class
        System.out.println("----------------------------------");
    }
}

//==========================================
//3. The Main Class (Where the program starts)
//==========================================

public class StudentDetails2 {

    public static void main(String[] args) {
    	
    	// Create a Scanner object to read what the user types in the console
        Scanner sc = new Scanner(System.in);
        
       // Create empty templates (objects) for two students in the computer's memory
        Student2 StudentOne = new Student2();
        Student2 StudentTwo = new Student2();

        // ---------- 1st Student ----------
        System.out.println("Enter Roll No:");
        int roll = sc.nextInt();
        sc.nextLine(); // VERY IMPORTANT: This "consumes" the invisible Enter key press so the next input doesn't skip!

        System.out.println("Enter Name:");
        String na = sc.nextLine();

        System.out.println("Enter Marks:");
        float mark = sc.nextFloat();
        sc.nextLine();

        Address add1 = new Address();

        System.out.println("Enter House No:");
        String hNo = sc.nextLine();

        System.out.println("Enter House Name:");
        String hName = sc.nextLine();

        System.out.println("Enter Lane:");
        String lane = sc.nextLine();

        System.out.println("Enter Pincode:");
        String pin = sc.nextLine();

     // Feed the typed inputs into the Address object
        add1.setAddress(hNo, hName, lane, pin);
        
     // FINALLY: Combine the basic info and the complex Address object into Student 1
        StudentOne.setDetails(roll, na, mark, add1);

        // ---------- 2nd Student ----------
        System.out.println("Enter Roll No:");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        na = sc.nextLine();

        System.out.println("Enter Marks:");
        mark = sc.nextFloat();
        sc.nextLine();

        Address add2 = new Address();

        System.out.println("Enter House No:");
        hNo = sc.nextLine();

        System.out.println("Enter House Name:");
        hName = sc.nextLine();

        System.out.println("Enter Lane:");
        lane = sc.nextLine();

        System.out.println("Enter Pincode:");
        pin = sc.nextLine();

        add2.setAddress(hNo, hName, lane, pin);

        StudentTwo.setDetails(roll, na, mark, add2);

        // ---------- Print Details ----------
        StudentOne.printDetails();
        StudentTwo.printDetails();

     // Close the scanner to prevent memory leaks (good practice)
        sc.close();
        
    }
}




