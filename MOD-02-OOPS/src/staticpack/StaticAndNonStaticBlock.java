//Demonstrate Static block,non-static block and non-static method

package staticpack;

class Demo{
	
	//Static Block or Static initializer Block or Initializer Block
	static{
		System.out.println("I am a Static Block");
	}
	
	//Non-Static Block
	{
		System.out.println("luminar");
	}
	
	//non static method
	public void display(){
		System.out.println("Helloooo");
	}
	

}

//main class
public class StaticAndNonStaticBlock {

	public static void main(String[] args) {
		
		Demo demoOne = new Demo();
		demoOne.display();
		
		Demo demoTwo = new Demo(); 
		demoTwo.display();
		
		Demo demoThree = new Demo(); 
		demoThree.display();
		
		
	}

}


