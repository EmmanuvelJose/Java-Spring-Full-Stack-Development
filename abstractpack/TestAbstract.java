package abstractpack;

//Abstract class
abstract class Vehicle {
	// static variable
	static String manufacturer;

	// non-static variable
	String make;
	String brand;

	static {
		manufacturer = "Tata Motors";
	}

	{
		make = "5-door hatchback city car";
	}

	// constructor
	Vehicle(String brand) {
		this.brand = brand;
	}

	// concrete method
	void showDetails() {
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Make: " + make);
		System.out.println("Brand: " + brand);
	}

	// abstract method
	abstract void run();
}

// Subclass
class Car extends Vehicle {
	int speed;

	// constructor chaining
	Car(String brand, int speed) {
		super(brand); // calls Vehicle constructor
		this.speed = speed;
	}

	// implementing abstract method
	@Override
	void run() {
		System.out.println("Speed: " + speed + " km/h");

	}
}

// Main class
public class TestAbstract {

	public static void main(String[] args) {

		Car c = new Car("Tata Tiago", 180); // constructor chaining
		c.showDetails(); // concrete method
		c.run(); // abstract method implementation
	}

}
