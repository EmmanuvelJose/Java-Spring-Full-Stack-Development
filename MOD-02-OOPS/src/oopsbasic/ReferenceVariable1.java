// Java program to demonstrate reference variable in java

package oopsbasic;

class Demo {
	int x = 10;

	int display() {
		System.out.println("x = " + x);
		return 0;
	}
}

public class ReferenceVariable1 {

	public static void main(String[] args) {

		Demo D1 = new Demo(); // point 1

		System.out.println(D1); // point 2

		System.out.println(D1.display()); // point 3

	}

}
