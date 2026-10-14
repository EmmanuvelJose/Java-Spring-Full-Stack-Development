//final keyword used with a class, variable and a method

package finalpack;

//final keyword restrict inheritance- stop inheritance
//if final keyword is used with a class that class can't be inherited by another class Second 

/*final*/ class First {
	final int roll = 15; // instance variable

	// if final keyword is used you can't override in class Second print()
	/* final */ void print() { // method
		System.out.println(roll);
		System.out.println(roll+15); //value of roll can be used to do operations 
		//roll=120;  The final field First.roll cannot be reassigned
	}
}

// child class

class Second extends First {
	// roll and print() are available here through inheritance
	void print() { // same method signature - print() but implementation is
					// different
		System.out.println("Hi");
	}
}

// same method signature means same return type,method name and arguments
//same method signature but different implementation is called method overriding

public class Demo {

	public static void main(String[] args) {

		First ft =  new First();
		ft.print();
		
		Second sc = new Second();
		sc.print();
		
	}

}
