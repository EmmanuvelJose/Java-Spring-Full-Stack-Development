//Values are passed as arguments into method setDetails while values are hard coded directly in the argument

package oopsassignment;

class EmployeeTwo {
	int empId;
	String empName;

	public void setDetails(int id, String name) {
		empId = id;
		empName = name;
	}

	public void getDetails() {
		System.out.println("empId = " + empId + "\t empName = " + empName);
	}
}

// main class
public class EmployeeTestTwo {

	public static void main(String[] args) {

		EmployeeTwo firstEmployee = new EmployeeTwo();
		firstEmployee.setDetails(28, "Emmanuvel");
		firstEmployee.getDetails();

	}

}
