//null in java

package oopsbasic;

class Demo3 {
	int x = 10;

	int display3() {
		System.out.println("x = " + x);
		return 0;
	}
}

public class ReferenceVariable7 {

	public static void main(String[] args) {
		Demo3 obj = null;

		// accessing instance(object) method
		obj.display3();

	}

}
