//values are user input from keyboard and passed as arguments to constructor EmployeeSix

package oopsassignment;

import java.util.Scanner;

class EmployeeSix {
	int empId;
	String empName;

	EmployeeSix(int id, String name) {
		empId = id;
		empName = name;
	}

	public void getDetails() {
		System.out.println("empId = " + empId + "\t empName = " + empName);
	}
}

// main class

public class EmployeeTestSix {

	public static void main(String[] args) {

		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		id = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		name = sc.next();

		EmployeeSix firstEmployee = new EmployeeSix(id, name);
		firstEmployee.getDetails();

	}

}
