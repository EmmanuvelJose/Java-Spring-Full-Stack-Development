//static and non-static data members

package staticpack;

class MCAStudent {
	// name and rollNo are not common for all students
	// so keep them as non-static data members
	String name;
	int rollNo;
	// As course offered is same for all students
	// so keep it as static.

	// String courseName ="MCA";
	static String courseName = "MCA";

	// constructor
	MCAStudent(String n, int r) {
		name = n;
		rollNo = r;
	}

	// display all value
	public void display() {
		System.out.println("Name= " + name);
		System.out.println("RollNo =" + rollNo);
		System.out.println("Course Name =" + courseName);
		System.out.println("");
	}

}

// main class
public class StaticCommonObjects {

	public static void main(String[] args) {
		// create object of MCAStudent class
		MCAStudent stu1 = new MCAStudent("Emmanuvel", 6);
		MCAStudent stu2 = new MCAStudent("Emison", 15);

		// method call
		stu1.display();
		stu2.display();

	}

}
