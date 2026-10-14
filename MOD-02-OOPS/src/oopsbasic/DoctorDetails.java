//DoctorDetails with Objects, set & print methods and instance variables
//Doctor Management System

package oopsbasic;

import java.util.Scanner;

class Doctor {

 int doctorId;
 String doctorName;
 String specialization;
 float consultationFee;

 // Method to set doctor details
 public void setDetails(int id, String name, String spec, float fee) {

     doctorId = id;
     doctorName = name;
     specialization = spec;
     consultationFee = fee;
 }

 // Method to print doctor details
 public void printDetails() {

     System.out.println("Doctor ID: " + doctorId +
             " | Doctor Name: " + doctorName +
             " | Specialization: " + specialization +
             " | Consultation Fee: " + consultationFee);
 }
}

//Main class
public class DoctorDetails {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     int id;
     String name;
     String spec;
     float fee;

     // ---------------------------- 1st Entry -------------------------------

     System.out.println("Enter the Doctor ID:");
     id = sc.nextInt();
     sc.nextLine();  // consume newline

     System.out.println("Enter the Doctor Name:");
     name = sc.nextLine();

     System.out.println("Enter the Specialization:");
     spec = sc.nextLine();

     System.out.println("Enter the Consultation Fee:");
     fee = sc.nextFloat();

     Doctor doctorOne = new Doctor();
     doctorOne.setDetails(id, name, spec, fee);

     // ---------------------------- 2nd Entry -------------------------------

     System.out.println("\nEnter the Doctor ID:");
     id = sc.nextInt();
     sc.nextLine();

     System.out.println("Enter the Doctor Name:");
     name = sc.nextLine();

     System.out.println("Enter the Specialization:");
     spec = sc.nextLine();

     System.out.println("Enter the Consultation Fee:");
     fee = sc.nextFloat();

     Doctor doctorTwo = new Doctor();
     doctorTwo.setDetails(id, name, spec, fee);

     // ---------------------------- Output -------------------------------

     System.out.println("\n--- Doctor Details ---");
     doctorOne.printDetails();
     doctorTwo.printDetails();

     sc.close();
 }
}
