//Static and Non-static members

package staticpack;

class Example{
	int x=10; //Non-Static data member
	static int y =2; //Static data member
	
	//static block
	static{
		//x=x+10; error because x is non-static 
		y=y+20;
	}
	
	//static method
	public static void display(){
		System.out.println("Hellooooo");
		// print();  error because print() is non-static
	}
	
	//Non-Static method
	public void print(){
		System.out.println(x+"     "+y); //can access both static and non-static data member inside a non-static method
		display();
	}
	
	//method chaining
	public void testing(){
		print();
		display();
		//print().display();
	}
}

//main class
public class StaticAndNonStaticMembers {
	
	
	public static void main(String[] args) {
		
		Example exampleOne = new Example();
		Example.display();
		exampleOne.print();
		exampleOne.testing();

	}

}
