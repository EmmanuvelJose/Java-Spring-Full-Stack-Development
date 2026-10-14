//Java Program to demonstrate Explicit Default Constructor using two objects

package oopsbasic;

//Class definition
public class ExplicitDefaultConstructorExample2 {
    
	 int number;
	 String text;

	 // Explicit default constructor
	 ExplicitDefaultConstructorExample2() {
	     number = 0;
	     text = "Default Text";
	     System.out.println("Explicit default constructor called!");
	 }
	 
	 void display() {
	     System.out.println("Number: " + number + ", Text: " + text);
	     }
	
	 
	//Main class	 
	public static void main(String[] args) {
		// Calls the explicit default constructor
		ExplicitDefaultConstructorExample2 obj1 = new ExplicitDefaultConstructorExample2();
		ExplicitDefaultConstructorExample2 obj2 = new ExplicitDefaultConstructorExample2();

	     // Optionally change values
	     obj1.number = 10;
	     obj1.text = "Hello";

	     obj2.number = 20;
	     obj2.text = "World";

	     obj1.display();
	     obj2.display();

	}

}


