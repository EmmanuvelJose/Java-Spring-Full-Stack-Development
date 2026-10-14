package college.staff;

import college.civil.staff.Teacher;

public class Test {

	public static void main(String[] args) {
		Teacher cseTeacher = new Teacher(1, "Priya"); // from college.cse.staff
		cseTeacher.teachCivil();

		// Fully qualify the second Teacher class from civil package
		college.cse.staff.Teacher civilTeacher = new college.cse.staff.Teacher(2, "Arun");
		civilTeacher.teachCSE();
	}

}
