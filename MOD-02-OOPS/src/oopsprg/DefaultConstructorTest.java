package oopsprg;

class Test{
	int i;
	Test t;
	boolean b;
	byte bt;
	float ft;
}

public class DefaultConstructorTest {
	public static void main(String args[]){
		Test t = new Test(); //default constructor is called
		System.out.println(t.i);
		System.out.println(t.t);
		System.out.println(t.b);
		System.out.println(t.bt);
		System.out.println(t.ft);
	}
}
