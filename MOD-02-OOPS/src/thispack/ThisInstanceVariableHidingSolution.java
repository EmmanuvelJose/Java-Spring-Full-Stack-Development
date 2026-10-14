//1.this can be used to differentiate between instance variable and local variable
//avoid Instance Variable Hiding by using “this” keyword

package thispack;

class Student4 {
	// instance variables
	int rollNo;
	String name;

	Student4(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void displayStudentDetails() {
		System.out.println("ROLLNO = " + rollNo + " NAME = " + name);
	}
}

//main class
public class ThisInstanceVariableHidingSolution {

	public static void main(String[] args) {
		Student4 student = new Student4(28, "Emmanuvel");
		student.displayStudentDetails();

	}

}
