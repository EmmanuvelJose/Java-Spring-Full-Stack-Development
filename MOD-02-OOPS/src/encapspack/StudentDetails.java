//Encapsulation is implemented using Java Bean Class
//A class with all data members as private and all getter and setter methods as public is called Java Bean Class

//Java Bean class
package encapspack;

class Student {
	private int rollNo;
	private String Name;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setRollNo(28);
		stu.setName("Emmanuvel Jose");

		System.out.println(stu.getRollNo() + "   " + stu.getName());

	}

}
