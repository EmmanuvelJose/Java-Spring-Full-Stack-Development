package thispack;

class Demo3 {

	Demo3(Test3 obj) { // obj or t anything can be used
		System.out.println("hello");
	}
} 

class Test3 {
	Test3() {
		Demo3 d = new Demo3(this); // this ==t, data type of t is test
	}
}

public class ParameterInConstructorCall {

	public static void main(String[] args) {

		Test3 t = new Test3();

	}

}
