//This program is used to show that the value of final variable can't be changed
//Here the value of final variable is initialized at the point of the declaration

package finalpack;

class Test{
	//final variable
	final int num = 100;
	
	//method for try to change the value of final variable.
	public void show() {
		//error because the value of final variable can't be changed
		//num=200;
		System.out.println("Num = "+ num);
	}
}
public class FinalVariable {

	public static void main(String[] args) {
		//Creating object of Test Class
		Test obj = new Test(); //method call
		obj.show();
	}

}
