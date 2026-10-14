//Java Program to demonstrate  Implicit Default Constructor

package oopsbasic;

public class MyClass {
	int value;    // Default value will be 0
    String name;  // Default value will be null

    // No constructor is defined here
    // Java automatically provides: MyClass() { }

	public static void main(String[] args) {
		 // Creating object using implicit default constructor
        MyClass obj = new MyClass();

        // Displaying default values
        System.out.println("Value: " + obj.value); // 0
        System.out.println("Name: " + obj.name);   // null

	}

}
