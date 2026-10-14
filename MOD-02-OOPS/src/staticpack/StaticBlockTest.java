//Static and Non-static Block

package staticpack;

public class StaticBlockTest {
	
	//static block
	static{
		System.out.println("Static Block");
	}
	
	//non-static block
	{
		System.out.println("Non-static block");
	}
	
	//main class
	public static void main(String[] args) {
		
		StaticBlockTest t1 = new StaticBlockTest();
		StaticBlockTest t2 = new StaticBlockTest();
		

	}

}
