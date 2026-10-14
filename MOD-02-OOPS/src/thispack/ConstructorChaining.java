// Demonstration of Constructor Chaining using this() keyword

package thispack;

class Demo{
	
	//Instance variable
	int x;
	
	//Default Constructor
	Demo(){
		
	 // Calls the parameterized constructor of the same class
     // Constructor chaining starts here
		this(10);
		 // Executes after the parameterized constructor finishes
		System.out.println("hello");
	}
	
	//Argument Constructor
	Demo(int x){
		
		// 'this.x' refers to the instance variable
        // 'x' refers to the local constructor parameter
		this.x = x;
	}
	
	// Method to display the value of x
	public void display(){
		System.out.println(x);
	}
}

//main class
public class ConstructorChaining {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.display();
	}

}
