//values are user input from keyboard and passed as arguments to method setDetails

package oopsassignment;

import java.util.Scanner;

class EmployeeThree {
	int empId;
	String empName;

	public void setDetails(int id, String name) {
		empId = id;
		empName = name;
	}

	public void getDetails() {
		System.out.println("empId = " + empId + "\t empName = " + empName);
	}
}

// main class
public class EmployeeTestThree {

	public static void main(String[] args) {

		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		id = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		name = sc.next();

		EmployeeThree firstEmployee = new EmployeeThree();
		firstEmployee.setDetails(id, name);
		firstEmployee.getDetails();

	}

}
