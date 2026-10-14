//Parameterized constructor with direct value

package oopsprg;

class ParameterTest {
	int i; // Instance variable (data member)

	// Parameterized constructor
	ParameterTest(int no) {
		// Assigning the value passed (no) to instance variable i
		i = no;
	}
}

public class ParameterizedConstructorTest {

	public static void main(String[] args) {
		// parameterized constructor is called
		// Value 23 is passed to constructor → no = 23 → i = 23
		ParameterTest first = new ParameterTest(23);
		// Printing the value of i stored in object 'first'
		System.out.println(first.i);
	}

}
