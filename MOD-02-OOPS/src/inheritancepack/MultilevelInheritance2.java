package inheritancepack;

//Level 1 - Base Class
class Vehicle {
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
	}

	void start() {
		System.out.println(brand + " vehicle is starting.");
	}
}

// Level 2-Intermediate Class

class Car extends Vehicle {
	String fuelType;

	Car(String brand, String fuelType) {
		super(brand); // call Vehicle constructor
		this.fuelType = fuelType;
	}

	void drive() {
		System.out.println(brand + " car runs on " + fuelType + ".");
	}
}

// Level 3-Derived class
class ElectricCar extends Car {
	int batteryCapacity;

	ElectricCar(String brand, int batteryCapacity) {
		super(brand, "Electric"); // Call Car constructor
		this.batteryCapacity = batteryCapacity;
	}

	void charge() {
		System.out.println(brand + " electric car charging with " + batteryCapacity + "kWh battery");
	}
}

public class MultilevelInheritance2 {

	public static void main(String[] args) {
		ElectricCar tesla = new ElectricCar("Tesla", 75);
		tesla.start(); // from Vehicle
		tesla.drive(); // from Car
		tesla.charge(); // from ElectricCar

	}

}
