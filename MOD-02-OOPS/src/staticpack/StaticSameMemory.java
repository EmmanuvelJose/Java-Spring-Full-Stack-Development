//static memory sharing among objects
package staticpack;

class Tests {
	static int num = 0;

	// constructor
	Tests() {
		num = num + 10;
	}

	public void printvalue() {
		System.out.println("Number = " + num);
	}
}

//main class
public class StaticSameMemory {

	public static void main(String[] args) {

		Tests obj1 = new Tests();
		obj1.printvalue();

		Tests obj2 = new Tests();
		obj2.printvalue();

		Tests obj3 = new Tests();
		obj3.printvalue();

		Tests obj4 = new Tests();
		obj4.printvalue();

		System.out.println("       ");

		obj1.printvalue();
		obj2.printvalue();
		obj3.printvalue();
		obj4.printvalue();

	}

}
