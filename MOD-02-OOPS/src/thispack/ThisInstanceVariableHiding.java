//1.this can be used to differentiate between instance variable and local variable
//Demonstrate Instance variable hiding

package thispack;

class Student3{
	// instance variables
	int rollNo;
	String name;

	Student3(int rollNo, String name) {
		rollNo = rollNo; //wrong
		name = name;
	}

	public void displayStudentDetails() {
		System.out.println("ROLLNO = " + rollNo + " NAME = " + name);
	}
}

//main class
public class ThisInstanceVariableHiding {

	public static void main(String[] args) {
		Student3 student = new Student3(28, "Emmanuvel");
		student.displayStudentDetails();
	}

}
