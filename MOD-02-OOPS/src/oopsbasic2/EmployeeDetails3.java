//EmployeeDetails with Default Constructor 

package oopsbasic2;

class Employee3{
	int empId;
	String empName;
	
	Employee3(){}  //Default Constructor
	
	public void printDetails(){
		System.out.println("Employee id:"+ empId + "\nEmployee Name:" + empName);
		
	}
}

//main class
public class EmployeeDetails3 {
	 public static void main(String[] args) {
		 Employee3 emp1 = new Employee3();
		 emp1.printDetails();
	 }

}
