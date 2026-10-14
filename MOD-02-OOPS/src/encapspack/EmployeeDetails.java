//Encapsulation is implemented using Getters and Setter methods

package encapspack;

class Employee {
	
	private int empNo;
	private String empName;
	private float empSal;

	// int empNo setters and getters
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	// String empName setters and getters
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;

	}

	// float empSal setters and getters
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public float getEmpSal() {
		return empSal;

	}

}

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpNo(28);
		emp.setEmpName("Emmanuvel Jose");
		emp.setEmpSal(400000.0f);
		
		System.out.println(emp.getEmpNo() + "  " + emp.getEmpName() + "  " + emp.getEmpSal());

	}

}
