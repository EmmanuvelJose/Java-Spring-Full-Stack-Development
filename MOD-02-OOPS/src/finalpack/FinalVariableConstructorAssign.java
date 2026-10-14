package finalpack;

class Example {
	final int instanceVariable;

	public Example(int value) {
		this.instanceVariable = value; // Must be initialized in the constructor
	}

	public void display() {
		System.out.println("The value of final instance variable is:" + instanceVariable);
	}
}

public class FinalVariableConstructorAssign {

	public static void main(String[] args) {
		Example ex = new Example(20);
		ex.display();

	}

}
