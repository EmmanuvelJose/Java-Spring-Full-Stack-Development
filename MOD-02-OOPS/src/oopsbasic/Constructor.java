//Java Program to demonstrate Constructor usage

package oopsbasic;

//Driver Class
public class Constructor {

	// Constructor
	Constructor() {
		super(); // used to call parent class
		System.out.println("Constructor Called");
	}

	// main function
	public static void main(String[] args) {
		Constructor con = new Constructor();

	}

}
