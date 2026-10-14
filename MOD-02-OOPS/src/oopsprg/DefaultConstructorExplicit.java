//Default & Parameterized constructor

package oopsprg;

class Tests {
	int i; // Instance variable (default value = 0)

	// Parameterized constructor
	Tests(int no) {
		i = no;   // Assign the passed value to variable i
	}

	// Explicit default constructor
	Tests() {
	}
}

//main class
public class DefaultConstructorExplicit {

	public static void main(String[] args) {
		// Tests t = new Tests(); //default constructor is called
		// error: The constructor Test is undefined,because we have a
		// parameterized one

		Tests one = new Tests();
		System.out.println(one.i);   // Output: 0

		Tests two = new Tests(10);
		System.out.println(two.i); // Output: 10

	}

}
