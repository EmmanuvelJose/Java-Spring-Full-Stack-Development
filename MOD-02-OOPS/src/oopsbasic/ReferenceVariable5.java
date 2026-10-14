//Pass by reference and value

package oopsbasic;

class Demo1 {
	int x = 10;
	int y = 20;

	int display1(Demo1 A, Demo1 B) {
		// Updating value using argument
		A.x = 95;

		System.out.println("x = " + x);

		System.out.println("y = " + y);

		return 0;
	}
}

public class ReferenceVariable5 {

	public static void main(String[] args) {
		Demo1 C = new Demo1();

		Demo1 D = new Demo1();

		// updating value using primary reference variable

		D.y = 55;

		C.display1(C, D); // POINT 1

		D.display1(C, D); // POINT 2

	}

}
