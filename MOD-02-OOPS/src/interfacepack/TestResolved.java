//The class cannot implement two interfaces in java that have methods with same name but different return type.

package interfacepack;

interface FirstInter {
	int show(); // no parameter
}

interface SecondInter {
	String show(String s); // parameter added-> different method
}

class Test implements FirstInter, SecondInter {

	@Override
	public String show(String s) {
		return "Hello" + s;
	}

	@Override
	public int show() {
		return 100;
	}

}

// Main class
public class TestResolved {

	public static void main(String[] args) {
		Test d = new Test();
		System.out.println(d.show()); // calls FirstInter's method
		System.out.println(d.show("World")); // calls SecondInter's method
	}

}
