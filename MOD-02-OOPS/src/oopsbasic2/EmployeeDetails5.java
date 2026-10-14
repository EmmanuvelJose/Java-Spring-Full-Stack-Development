//EmployeeDetails with Default Constructor and initial values

package oopsbasic2;

class Employee5{
	int empId;
	String empName;
	
	Employee5(){      //Default Constructor with initial values
		empId=28;
		empName="Emmanuvel";  
	}           
	
	public void printDetails(){
		System.out.println("Employee id:"+ empId + "\nEmployee Name:" + empName);
		
	}
}

//main class
public class EmployeeDetails5 {
	 public static void main(String[] args) {
		 
		 Employee5 emp1 = new Employee5();
		 emp1.printDetails();
		 
		 Employee5 emp2 = new Employee5();
		 emp2.printDetails();
	 }

}
