//Accessing  multiple instance methods

package oopsbasic;

class Demo {

	int x = 10;

	int display() {
		System.out.println("x = " + x);
		return 0;
	}
}

public class ReferenceVariable3 {

	public static void main(String[] args) {

		// create instances
		Demo D1 = new Demo();

		Demo M1 = new Demo();

		Demo Q1 = new Demo();
		D1.display();
		M1.display();
		Q1.display();

	}

}
