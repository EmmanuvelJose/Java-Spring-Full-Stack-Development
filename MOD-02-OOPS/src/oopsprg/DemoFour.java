//user-defined default constructor with explicit initialization

package oopsprg;

class EmployeeFour {
	int empNo;
	String empName;

	// User-defined default constructor
	EmployeeFour() {
		
		// Explicitly initializing empNo to 0 and empName to null
		empNo = 0;
		empName = null;
	}
}

public class DemoFour {

	public static void main(String[] args) {
		
		EmployeeFour obj1 = new EmployeeFour();
		System.out.println(obj1.empNo + "\t" + obj1.empName);
		
		EmployeeFour obj2 = new EmployeeFour();
		System.out.println(obj2.empNo + "\t" + obj2.empName);

	}

}
