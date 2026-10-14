//2. this() can be used in constructor chaining.

package thispack;

class Student5 {

	// Instance variables
	int rollNo;
	String name;

	// Default constructor
	Student5() {
		// Calls the two-argument constructor
		// Control goes to Student5(rollNo, String name)
		this(23, "Arun");
	}

	// One-argument constructor
	Student5(int rollNo) {
		// Calls the two-argument constructor
		// The received rollNo is passed along with name "Priya"
		this(rollNo, "Priya");
	}

	// Two-argument constructor
	Student5(int rollNo, String name) {
		// Assigning local variables to instance variables
		this.rollNo = rollNo;
		this.name = name;
	}

	// Method to display student details
	void showDetails() {
		System.out.println("Student Details:");
		System.out.println("Roll no:" + rollNo);
		System.out.println("Name:" + name);
	}
}

// main class
public class ThisConstructorChaining {

	public static void main(String[] args) {

		Student5 obj1 = new Student5();
		obj1.showDetails();

		Student5 obj2 = new Student5();
		obj2.showDetails();

		Student5 obj3 = new Student5();
		obj3.showDetails();
	}

}
