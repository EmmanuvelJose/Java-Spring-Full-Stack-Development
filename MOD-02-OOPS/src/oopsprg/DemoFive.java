//user-defined default constructor with custom initialization

package oopsprg; // Defines the package name

// Class definition
class EmployeeFive {
	int empNo;       // Instance variable to store employee number
	String empName;  // Instance variable to store employee name

	// Default constructor (no parameters)
	EmployeeFive() {
		// Initializing instance variables
		empNo = 23;
		empName = "bini";
	}
}

// Main class
public class DemoFive {

	public static void main(String[] args) {
		
		// Creating first object of EmployeeFive
		// Constructor is automatically called when object is created
		EmployeeFive obj1 = new EmployeeFive();
		
		// Printing values of obj1
		// Accessing variables using object reference
		System.out.println(obj1.empNo + "\t" + obj1.empName);
		
		// Creating second object of EmployeeFive
		// Constructor is called again separately for this object
		EmployeeFive obj2 = new EmployeeFive();
		
		// Printing values of obj2
		// Both objects have same values because constructor assigns same data
		System.out.println(obj2.empNo + "\t" + obj2.empName);
	}
}