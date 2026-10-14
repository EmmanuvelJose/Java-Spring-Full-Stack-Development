//values are hard coded into method setDetails

package oopsassignment;

class EmployeeOne {
	int empId;
	String empName;

	public void setDetails() {
		empId = 28;
		empName = "Emmanuvel";
	}		

	public void getDetails() {
		System.out.println("empId = " + empId + "\t empName = " + empName);
	}
}

// main class
public class EmployeeTestOne {

	public static void main(String[] args) {
		EmployeeOne firstEmployee = new EmployeeOne();
		firstEmployee.setDetails();
		firstEmployee.getDetails();

	}

}
