//Parameterized constructor with dynamic value

package oopsprg;

import java.util.Scanner;

class EmployeeSeven {
	int empNo;
	String empName;

	// Parameterized constructor with one parameter
	EmployeeSeven(int empId) {
		empNo = empId;  // assign the passed value to empNo
	}
}

//main class
public class DemoSeven {

	public static void main(String[] args) {
		int id; // variable to store user input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id:");
		id = sc.nextInt();

		EmployeeSeven obj1 = new EmployeeSeven(id);
		
		// empName is not initialized, so it will print default value (null)
		System.out.println(obj1.empNo + "\t" + obj1.empName);

		sc.close();

	}

}
