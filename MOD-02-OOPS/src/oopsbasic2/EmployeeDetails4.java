//EmployeeDetails with Default Constructor & Default values 

package oopsbasic2;

class Employee4{
	int empId;
	String empName;
	
	  //Default Constructor with Default values
	Employee4(){  
		empId=0;
		empName="";   // empName=null;
	}           
	
	public void printDetails(){
		System.out.println("Employee id:"+ empId + "\nEmployee Name:" + empName);
		
	}
}

//main class
public class EmployeeDetails4 {
	 public static void main(String[] args) {
		 Employee4 emp1 = new Employee4();
		 emp1.printDetails();
	 }

}
