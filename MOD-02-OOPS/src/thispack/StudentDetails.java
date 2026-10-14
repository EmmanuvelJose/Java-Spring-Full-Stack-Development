//Without using 'this' keyword

package thispack;

class Student {
	int roll; //Instance Variables
	String name;

	// Constructor
	Student(int ro, String na) {
		roll = ro;
		name = na;
	}

	// method
	public void print() { // this==s
		System.out.println(roll + "    " + name);
	}
}

// main class
public class StudentDetails {

	public static void main(String[] args) {
		Student s = new Student(2, "Emmanuvel");
		s.print();
	}

}
