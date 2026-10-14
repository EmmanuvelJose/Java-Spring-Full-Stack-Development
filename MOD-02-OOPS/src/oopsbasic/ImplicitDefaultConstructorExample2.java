//Java Program to demonstrate  Implicit Default Constructor using two objects

package oopsbasic;

//Class definition
public class ImplicitDefaultConstructorExample2 {
    
	int number;
    String text;

	 // No constructor is written here
	 // Java automatically provides: ImplicitDefaultConstructorExample2() { }

	 void display() {
	     System.out.println("Number: " + number + ", Text: " + text);
	     }

  
//Main class
	public static void main(String[] args) {
		// Using the implicit default constructor
		ImplicitDefaultConstructorExample2 obj1 = new ImplicitDefaultConstructorExample2(); // Calls hidden ImplicitDefaultConstructorExample2() constructor
		ImplicitDefaultConstructorExample2 obj2 = new ImplicitDefaultConstructorExample2();

	     // Assigning values manually
	     obj1.number = 10;
	     obj1.text = "Hello";

	     obj2.number = 20;
	     obj2.text = "World";

	     obj1.display();
	     obj2.display();
	}

}



