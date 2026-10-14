//Constructor initialization and default values of instance variables

package oopsprg;  

class EmployeeSix {
	int empNo;      // Instance variable (int type)
	String empName; // Instance variable (String type)

	// Constructor
	EmployeeSix() {
		empNo = 23;  
		// empNo is explicitly initialized to 23
		
		// empName is NOT initialized
		// So it takes the default value → null (for objects in Java)
	}
}

// Main class
public class DemoSix {

	public static void main(String[] args) {
		
		// Creating first object
		EmployeeSix obj1 = new EmployeeSix();
		
		// Printing values of obj1
		System.out.println(obj1.empNo + "\t" + obj1.empName);
		// Output: 23    null
		
		// Creating second object
		EmployeeSix obj2 = new EmployeeSix();
		
		// Printing values of obj2
		System.out.println(obj2.empNo + "\t" + obj2.empName);
		// Output: 23    null
		
		// Explanation:
		// Each object gets its own copy of instance variables
		// Constructor initializes empNo for each object
		// empName remains null because it's not assigned any value
	}
}