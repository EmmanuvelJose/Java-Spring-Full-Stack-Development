package college.civil.staff;

public class Teacher {
	int id;
	String name;

	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void teachCivil() {
		System.out.println("Teaching Civil subjects");
	}
}
