package thispack;

class Demo4 {

	public void display() {
		System.out.println("hello");
		test4(this);
	}

	public void test4(Demo4 t) {
		System.out.println("luminar");
	}
}

// main class
public class ParameterMethodCall {

	public static void main(String[] args) {
		Demo4 d = new Demo4();
		d.display();
	}

}
