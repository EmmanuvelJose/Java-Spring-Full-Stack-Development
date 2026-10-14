//main() in separate class

package oopsprg;

class EmployeeTwo {
	int empNo;
	String empName;
}

public class DemoTwo {

	public static void main(String[] args) {
		EmployeeTwo obj = new EmployeeTwo();
		System.out.println(obj.empNo + "\t" + obj.empName);
	}

}
