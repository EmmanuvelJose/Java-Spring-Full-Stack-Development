package accesspack;

/**
 * 
 * This program is used to show that we cannot create an instance of that class
 * from outside the class if constructor is private
 *
 */

class Students {
	// private constructor of the class
	private Students() {

	}

	public void show() {
		System.out.println("Hello");
	}
}

public class PrivateConstructor {

	public static void main(String[] args) {
		// compile time error in creating student class object
		// because of private constructor.
		Students obj = new Students();
	}

}
