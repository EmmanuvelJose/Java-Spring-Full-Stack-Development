//3.this can be used to invoke current class method implicitly

package thispack;

class Test{
	
	public void display(){
		System.out.println("1111111111");
		// Calls another method of the same class using this keyword
		this.testing();
	}
	
	public void print(){
		System.out.println("22222222222");
		// Calls display() method of the current object
		// this.display() and display() are equivalent
		this.display();
		//display(); 
	}
	
	public void testing(){
		System.out.println("33333333333");
	}
}

//main class
public class MethodChaining {

	public static void main(String[] args) {
	
		Test t = new Test();
		t.print();  	// Control goes to print()
	}

}
