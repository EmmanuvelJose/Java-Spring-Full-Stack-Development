//Java Program to demonstrate  Implicit Default Constructor 
package oopsbasic;

public class ImplicitDefaultConstructorExample1 {
	
	int value;    // Default value will be 0
    String name;  // Default value will be null

    // No constructor is defined here
    // Java automatically provides: ImplicitDefaultConstructorExample1() { }

	public static void main(String[] args) {
	
		 // Creating object using implicit default constructor
		ImplicitDefaultConstructorExample1 obj = new ImplicitDefaultConstructorExample1();

        // Displaying default values
        System.out.println("Value: " + obj.value); // 0
        System.out.println("Name: " + obj.name);   // null

	}

}


