package accesspack;

class Student {
	// Private member of the class
	private int rollNo = 5;

	private void showRollNo() {
		// rollNo which a private data member is accessible in that class
		System.out.println("RollNo=" + rollNo);
	}
}

public class PrivateAccessModifier {

	public static void main(String[] args) {
		// Creating Student class object
		Student obj = new Student();
		// compile time error because private members
		// of a class can be accessed in that class only
		System.out.println(obj.rollNo);
		obj.showRollNo();
	}

}
