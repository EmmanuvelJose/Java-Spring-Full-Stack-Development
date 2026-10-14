package staticpack;
 
class Testes{
	//non static method
	public void show(){
		System.out.println("Hello world");
	}
	
	static{
		//error because non-static methods can't be
		//accessed in static initializer block
		show();
	}
	public static void display(){
		System.out.println("Hello....");
		//error because non-static methods can't be
		//accessed in static method
		show();
	}
}

//main class
public class StaticNonStaticMethods {

	public static void main(String[] args) {
		
//code..
	
	}
}
