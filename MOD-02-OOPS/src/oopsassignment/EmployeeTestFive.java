//Values are passed as arguments to Constructor EmployeeFive  while values are hard coded directly in argument

package oopsassignment;

class EmployeeFive {
	int empId;
	String empName;

	EmployeeFive(int id, String name) {
		empId = id;
		empName = name;
	}

	public void getDetails() {
		System.out.println("empId = " + empId + "\t empName = " + empName);
	}
}

// main class

public class EmployeeTestFive {

	public static void main(String[] args) {

		EmployeeFive firstEmployee = new EmployeeFive(28, "Emmanuvel");
		firstEmployee.getDetails();
	}

}
