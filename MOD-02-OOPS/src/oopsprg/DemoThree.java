// User-defined default constructor 

package oopsprg;

class EmployeeThree {
	int empNo;
	String empName;

	// User-defined default constructor (no parameters)
    // It does not assign any values explicitly
    // So variables will take default values (0 and null)
	EmployeeThree() {
	}
}

public class DemoThree {
	public static void main(String[] args) {
		
	    // Calls the user-defined default constructor
		EmployeeThree obj = new EmployeeThree();
		
		System.out.println(obj.empNo + "\t" + obj.empName);
	}
}
