package college.cse.staff;

public class Teacher {
	int id;
	String name;

	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void teachCSE() {
		System.out.println("Teaching CSE subjects");
	}
}