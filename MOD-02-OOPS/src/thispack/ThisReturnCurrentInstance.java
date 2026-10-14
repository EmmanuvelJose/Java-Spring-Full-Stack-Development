package thispack;

class Current {
	public Current getDisplay() {
		return this; // return the current class instance
	}

	public void print() {
		System.out.println("hi");
	}
}

// main class
public class ThisReturnCurrentInstance {

	public static void main(String[] args) {
		Current obj = new Current();
		obj.getDisplay().print();

	}

}
