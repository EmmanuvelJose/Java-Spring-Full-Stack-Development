//This program is used to show that the value of final variable can't be changed

package finalpack;

class Test {
	// final variable
	final int num = 100;

	// method for try to change the value of final variable
	public void show() {
		// error because value of final variable can't be changed
		// num=200;
		System.out.println("Num = " + num);
	}
}

public class FinalVariable {

	public static void main(String[] args) {
		// creating object of Test Class
		Test obj = new Test(); 
		// method call
		obj.show();
	}

}
