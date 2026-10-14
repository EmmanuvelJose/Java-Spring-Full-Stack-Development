package inheritancepack;

//Parent class(Base class)
class Teacher {
	public String name;
	public int age;

	Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void teach() {
		System.out.println(name + " is teaching");
	}
}

// Child class(Derived Class)
class MathTeacher extends Teacher {
	String subject;

	MathTeacher(String name, int age, String subject) {

		super(name, age); // calling parent constructor
		/*
		 * If you try this.name = name; in MathTeacher: It gives an error only
		 * if there’s no name field in MathTeacher, because Java checks the
		 * current class for that field. Since name is in the superclass, you’d
		 * be accessing an inherited variable without declaring it locally,
		 * which may confuse Java about where name belongs if not handled
		 * carefully. So, those fields should be initialized using the Teacher's
		 * constructor. super(name, age); calls the parent constructor, which
		 * already does:this.name = name; and this.age = age;
		 */
		this.subject = subject;
	}

	void explainMathConcept() {
		System.out.println(name + " is explaining a " + subject + " concept");
	}
}

// Main Class
public class SingleInheritance5 {

	public static void main(String[] args) {
		MathTeacher mTeacher = new MathTeacher("Emmanuvel", 40, "Algebra");
		mTeacher.teach(); // From parent class
		mTeacher.explainMathConcept(); // From child class
	}

}
