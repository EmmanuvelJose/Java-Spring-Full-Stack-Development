//Pointing to same instance memory

package oopsbasic;

class Demo {
	int x = 10;

	int display() {
		System.out.println("x = " + x);
		return 0;
	}
}

public class ReferenceVariable4 {

	public static void main(String[] args) {
		// create instance
		Demo D1 = new Demo();

		// point to same reference
		Demo G1 = D1;

		Demo M1 = new Demo();

		Demo Q1 = M1;

		// updating the value of x using G!
		// reference variable
		G1.x = 25;
		M1.x = 30;

		System.out.println(G1.x); // Point 1

		System.out.println(D1.x); // Point 2

		System.out.println(Q1.x); // Point 3
	}

}
