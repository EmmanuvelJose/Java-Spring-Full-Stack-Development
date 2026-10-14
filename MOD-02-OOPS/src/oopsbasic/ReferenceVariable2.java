//Java program to access instance variables and methods

package oopsbasic;

class Demo {
	int x = 10;

	int display() {
		System.out.println("x = " + x);
		return 0;
	}
}

public class ReferenceVariable2 {
	public static void main(String[] args) {
		// create instance
		Demo D1 = new Demo();

		// accessing instance(object) variable
		System.out.println(D1.x);

		// point 3
		// accessing instance(object) method
		D1.display();
	}
}