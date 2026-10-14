//EmployeeDetails with Default values & Default Constructor

package oopsbasic2;

class Employee2{
	int empId;           //instance variables or properties                                
	String empName;
	
	public void printDetails(){                                  //method
		System.out.println("Employee id:"     + empId +
				           "\nEmployee Name:" + empName);
		
	}
}

//main class
public class EmployeeDetails2 {
	 public static void main(String[] args) {
		 //creating object for employee class
		 Employee2 emp1 = new Employee2();
		 emp1.printDetails();
	 }

}
