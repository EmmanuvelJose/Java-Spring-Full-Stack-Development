//Static method

package staticpack;

class Display {
	// static method
	public static void display() {
		System.out.println("Hello...");
	}
}

// main class
public class StaticMethod {

	public static void main(String[] args) {
		
		// No need for object to call static method
		// Calling static method using class name
		// No object creation is needed
		Display.display();

	}

}
