//Demonstrate the working and common sharing behavior of a static variable among multiple objects
package staticpack;

//A simple class to demonstrate static variable sharing
class Test{
	
	// Static variable 
	// Only ONE copy of this variable exists for the entire class
	// It is shared by all objects
	static int no;
	
	// This constructor runs whenever a new object is created
	Test(){		
		// Increase the value of static variable by 10
		no=no+10;
	}
	
	//method to display the current value of 'no'
	public void display(){
		
	// Print the shared static variable
		System.out.println(no);
	}
	
}

//main class
public class StaticCommonSharingDemo {

	public static void main(String[] args) {
		

		// Object 1 created
		// Constructor runs -> no = 0 + 10 = 10
		Test testOne = new Test();
		testOne.display();   // Prints 10
		
		// Object 2 created
		// Constructor runs -> no = 10 + 10 = 20
		Test testTwo = new Test();
		testTwo.display();   // Prints 20
		
		// Object 3 created
		// Constructor runs -> no = 20 + 10 = 30
		Test testThree = new Test();
		testThree.display();  		// Prints 30
		
		// Object 4 created
		// Constructor runs -> no = 30 + 10 = 40
		Test testFour = new Test();
		testFour.display(); 		// Prints 40
		
		// Object 5 created
		// Constructor runs -> no = 40 + 10 = 50
		Test testFive = new Test();
		testFive.display();    		// Prints 50
		
		// All objects share the SAME static variable
		// Current value of no = 50
		System.out.println(" ");
		// Prints 50
		testOne.display();
		testFour.display();
		testTwo.display();
		testThree.display();
	}

}
