//Interface- 100% abstraction
package interfacepack;

/*
interface Employee { // Interface is by default abstract

	// All variables declared inside an interface are implicitly static and final
	static final int x = 100; // static and final are non-access modifiers

	// void doWork(); - not best practice //or
	public abstract void doWork(); // best practice- all methods inside an interface is by default public abstract
	//public is access modifier and abstract is non-access modifiers
}

*/

class Accountant implements Employee {

	@Override
	public void doWork() {
		System.out.println("Account related activities");
		System.out.println(x + 20);
	}
}

class Hr implements Employee {

	@Override
	public void doWork() {
		System.out.println("HR related activities");
	}
}

public class LuminarEmployee {

	public static void main(String[] args) {

		// InterfaceName referenceVariableName = new SubclassConstructor()
		Employee ac = new Accountant(); // or
		// Accountant ac = new Accountant(); - both are correct
		ac.doWork();
	}

}
