package interfacepack;

//First interface
interface Printable {
	void print();
}

// Second interface
interface Showable {
	void show();
}

// Class implementing multiple interfaces
class Demoo implements Printable, Showable {

	@Override
	public void show() {
		System.out.println("Hello from show()");

	}

	@Override
	public void print() {
		System.out.println("Hello from print()");
	}

}

// Main class
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Demoo d = new Demoo();
		d.print();
		d.show();
	}
}
