//constructor overloading using an Employee class.

package oopsbasic2;

class Employee6{
	int empId;
	String empName;
	
	Employee6(){}  // Default Constructor
	
	Employee6(int id) {
		empId = id;
		//empName = name;  
	}
	
	Employee6(String name){
		//empId = id;
		empName = name;
	}
	
	Employee6(String name, int id) {
		empId = id;
		empName = name;
	}
	
	Employee6(int id, String name) {
		empId = id;
		empName = name;
	}
	
	
	public void printDetails(){
		System.out.println("Employee ID:"+ empId + "\nEmployee Name:" + empName);
		
	}
}

//main class
public class EmployeeDetails6 {
	 public static void main(String[] args) {
		 
		 Employee6 emp1 = new Employee6();
		 System.out.println("Default Constructor\n============================\n");
		 emp1.printDetails();
		 
		 Employee6 emp2 = new Employee6(15);
		 System.out.println("\nConstructor(int)\n============================\n");
		 emp2.printDetails();
		 
		 Employee6 emp3 = new Employee6("Alex");
		 System.out.println("\nConstructor(string)\n============================\n");
		 emp3.printDetails();
		 	
		 Employee6 emp4 = new Employee6("Antony",23);
		 System.out.println("\nConstructor(String,int)\n============================\n");
		 emp4.printDetails();
		 
		 Employee6 emp5 = new Employee6(28,"Emmanuvel"); 
		 System.out.println("\nFull Argument Constructor\n============================\n");
		 emp5.printDetails();
		 
		
	 }

}
