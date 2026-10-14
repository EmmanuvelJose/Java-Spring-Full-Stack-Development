package thispack;

class Demo1 {
	Demo1(Test1 test) {
		System.out.println(test);
	}
}

class Test1 {
	Test1() {
		// System.out.println("hi) //allowed
		Demo1 d = new Demo1(this);
	}
}

// main class
public class ThisParameterInConstructorCall {

	public static void main(String[] args) {
		Test1 obj = new Test1();
	}

}
