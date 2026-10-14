package abstractpack;

//abstract class- Parent class
abstract class Employee {

	int basicPay = 30000; // Instance variable
	static String empId = "L01"; // static variables

	// concrete method-normal method-can call static and non static members
	public void calculateSalary() {
		System.out.println(basicPay);
		System.out.println(empId);
	}

	// static method-can call only static members
	public static void printCode() {
		System.out.println(empId);
	}

	// abstract method
	public abstract void doWork(); // only signature no implementation
	// no permission to give curly braces
}

// subclass
class Accountant extends Employee {

	// class Accountant contains all Invisible members like
	// doWork(),printCode(),calculateSalary(),basicPay and empId
	// abstract method implementation
	@Override
	public void doWork() { // for implementation don't use abstract keyword
		System.out.println("Account related activities");
	}

}

// Subclass-abstract class
abstract class Hr extends Employee {

	public abstract void calculateSalary();

	// abstract method implementation
	@Override
	public void doWork() {
		System.out.println("Hr related activities");

	}

}

// normal class- -usage in Multilevel Inheritance
class Luminar extends Hr {

	@Override
	public void calculateSalary() {
		System.out.println(basicPay);
		System.out.println(empId);
	}

	public void doWork() {
		System.out.println("Luminar related activities");
	}
}


// Main class
public class LuminarEmployee {

	public static void main(String[] args) {

		// parentClassName/InterfaceName refernceVariableName = new subclass();
		Employee ac = new Accountant(); // late binding
		ac.doWork();

	/*	Employee hr = new Hr();
	    hr.doWork();  - for this to execute without any error  the class Hr must not be a abstract class
		*/
		ac.calculateSalary();
		Employee.printCode(); // static method must be accessed using className
								// used instead of ac.printCode();

	}

}
