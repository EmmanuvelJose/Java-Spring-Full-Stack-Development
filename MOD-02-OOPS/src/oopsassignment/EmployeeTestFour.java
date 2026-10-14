//values are hard coded in the constructor EmployeeFour()

package oopsassignment;

class EmployeeFour {
	int empId;
	String empName;

	EmployeeFour() {
		empId = 28;
		empName = "Emmanuvel";
	}

	public void getDetails() {
		System.out.println("empId = " + empId + "\t empName = " + empName);
	}
}

// main class
public class EmployeeTestFour {

	public static void main(String[] args) {

		EmployeeFour firstEmployee = new EmployeeFour();
		firstEmployee.getDetails();
	}

}
