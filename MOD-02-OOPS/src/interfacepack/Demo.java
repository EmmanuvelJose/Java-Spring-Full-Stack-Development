//Interface to avoid diamond problem
package interfacepack;

interface Student {
	void print();
}

interface Teacher {
	void print();
}

public class Demo implements Student, Teacher {

	public void print() {
		System.out.println("Excellent");

	}

}
