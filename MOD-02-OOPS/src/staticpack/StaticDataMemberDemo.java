//To demonstrate the use of Static final data members

package staticpack;

//Student class
class Student {

	// Instance variable -> each object has separate copy
	int rollNo;
	String name;

	// Static final variable
	// 'static' means shared by all objects
	// 'final' means value cannot be changed
	static final String course = "M.Tech";

	// Constructor to initialize student details
	Student(int ro, String na) {
		rollNo = ro; // Assign parameter value to rollNo
		name = na; // Assign parameter value to name
	}

	// Method to display student details
	public void display() {
		System.out.println("RollNo: " + rollNo + "\nName:" + name + "\nCourse: " + course);
	}
}

// main class
public class StaticDataMemberDemo {

	public static void main(String[] args) {

		Student studentOne = new Student(1, "Emmanuvel Jose");
		studentOne.display();

		//studentOne.course="B.Tech";  -This line gives error because the final field Student.course cannot be assigned and 
									// The static field Student.course should be accessed in a  static way
		
		Student studentTwo = new Student(2, "Dona Jose");
		studentTwo.display();

		Student studentThree = new Student(3, "Sona Jose");
		studentThree.display();

		// Display first student again
		studentOne.display();

	}

}
