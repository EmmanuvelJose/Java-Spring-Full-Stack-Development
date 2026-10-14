/* This program is used to show that members of the class of  a class can 
 * an be accessed in the package level only
 * Default access modifier- Same packages\Different classes
 */
package accesspack;

class MCAStudents {
	int rollNo = 5;

	void showRollNo() {
		System.out.println("RollNo=" + rollNo);
	}
}

public class DefaultAccessModifier {
	public static void main(String args[]) {
		// Creating Students class object
		MCAStudents obj = new MCAStudents();

		// No compile time error because members of the class
		// of a class can be accessed in that package but can't be
		// accessed outside the package
		System.out.println(obj.rollNo);
		obj.showRollNo();
	}
}
