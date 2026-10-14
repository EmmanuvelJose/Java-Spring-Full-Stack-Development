//Java Program to demonstrate  Explicit Default Constructor
package oopsbasic;

public class ExplicitDefaultConstructorExample1 {
    
	int value;
    String name;

    // User-defined no-arg constructor (explicit default constructor)
    public ExplicitDefaultConstructorExample1() {
        value = 10;
        name = "Default";
        System.out.println("Explicit default constructor called!");
    }

	public static void main(String[] args) {
		// Creating object -> calls your constructor
		ExplicitDefaultConstructorExample1 obj = new ExplicitDefaultConstructorExample1();

        // Display initialized values
        System.out.println("Value: " + obj.value);
        System.out.println("Name: " + obj.name);
	}
}
