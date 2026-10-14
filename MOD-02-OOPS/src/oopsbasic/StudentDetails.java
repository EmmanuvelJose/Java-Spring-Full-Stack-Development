//StudentDetails with Objects, set&print methods and instance variables - Student Management System

package oopsbasic;

import java.util.Scanner;

/*
class Address {

	String houseNo;
	String houseName;
	String ResidentialLane;
	String pincode;
}
*/

class Student { // Doctor //Employee //Customer

	int rollNo;
	String name;
	float marks;
	/* Address studentAddress; */

	public void setDetails(int ro, String n, float ma) {
		rollNo = ro;
		name = n;
		marks = ma;

	}

	public void printDetails() {

		System.out.println("rollno:" + rollNo + "  name:  " + name + "  marks:" + marks);

	}

}

// main class
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int roll;
		String na;
		float mark;

		// ---------------------------- 1st entry -------------------------------
		
		System.out.println("enter the roll no:");
		roll = sc.nextInt();

		sc.nextLine();

		System.out.println("enter the name:");
		na = sc.nextLine();

		System.out.println("enter the marks:");
		mark = sc.nextFloat();
		// ---------------------------- 1st entry -------------------------------
	

		Student objOne = new Student(); // object One created
		Student objTwo = new Student(); // object Two created

		objOne.setDetails(roll, na, mark); // values are set to objOne

		// ---------------------------- 2nd entry -------------------------------
		
		System.out.println("enter the roll no:");
		roll = sc.nextInt();

		sc.nextLine();

		System.out.println("enter the name:");
		na = sc.nextLine();

		System.out.println("enter the marks:");
		mark = sc.nextFloat();
		// ---------------------------- 2nd entry -------------------------------

		objTwo.setDetails(roll, na, mark); // values are set to objTwo

		objTwo.printDetails(); // values of objTwo are printed
		objOne.printDetails(); // values of objOne are printed

		System.out.println(roll + "\n" + na + "\n" + mark); // main method
															// memory

		objOne.printDetails(); // values of objOne are printed

		sc.close();
	}

}
