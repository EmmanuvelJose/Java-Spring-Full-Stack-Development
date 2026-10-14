package thispack;

class Trail {
	public void display() {
		System.out.println("hi");
		print(this);
	}

	public void print(Trail obj) {
		System.out.println(obj);
	}
}

// main class
public class ThisParameterMethodCall {

	public static void main(String[] args) {
		Trail trail = new Trail();
		trail.display();

	}

}
