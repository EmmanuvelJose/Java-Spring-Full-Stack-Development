package thispack;

class Demo2 {

	public Demo2 display() {
		System.out.println("hello");

		return this; // this==d==Demo2
	}

	public void print() {
		System.out.println("luminar");
	}
}

// main class
public class ReturnCurrentInstance {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.display().print();

	}

}
