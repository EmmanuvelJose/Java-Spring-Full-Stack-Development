package staticpack;

class TestDemo{
	//non-static data member
	int num = 10;
	
	static{
		//error because non-static data members can't be 
		//accessed in static initializer block
		System.out.println("Num = "+ num);
	}
	
	public static void display(){
		System.out.println("Hello...");
		//error because non-static data members can't be
		//accessed in static method
		System.out.println("Num  = "+ num);
	}
}
//main class
public class StaticBlockNonStaticDataMembers {

	public static void main(String[] args) {
		
  //code...
	}

}
