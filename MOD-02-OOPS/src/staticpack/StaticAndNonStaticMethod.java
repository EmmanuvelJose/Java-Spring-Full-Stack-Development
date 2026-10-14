//static methods accessed directly using the class name without creating objects.
package staticpack;

class Trial1{
	//static method 1
	public static void display(){
		System.out.println("helllooooooooo");
	}
}

class Trial2{
	//static method 2
	public static void display(){
		System.out.println("Thankyouuuuuuuuu");
	}
}

//main class
public class StaticAndNonStaticMethod {

	public static void main(String[] args) {
		Trial1 trialOne =  new Trial1();
		
	//	TrialOne.display();  - Non-Static way
		
		Trial1.display(); //Static Way
		Trial2.display();
	}

}
