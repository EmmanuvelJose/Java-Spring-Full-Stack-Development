//3. this can be used to invoke current class method implicitly

package thispack;

//CurrentClass contains three methods
class CurrentClass {

	// Method to display roll number
	public void displayRollNo() {
		// Prints the roll number
		System.out.println(28);
		// this.displayName(); //or
		displayName();
		// displayName() is internally treated as this.displayName()
	}

	// Method to display name
	void displayName() {
		// Prints the name
		System.out.println("Emmanuvel");
		displayStream(); // this.displayStream();
	}

	// Private method
	private void displayStream() {
		// Prints the stream/course
		System.out.println("BTech CS");
	}
}

//main class
public class ThisMethodChaining {

	public static void main(String[] args) {

		CurrentClass obj1 = new CurrentClass();
		obj1.displayRollNo();

	}

}
