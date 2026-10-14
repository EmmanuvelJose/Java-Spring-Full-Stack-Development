package abstractpack;

abstract class DemoVehicle {
	abstract void start();

	abstract void stop();
}

abstract class DemoCar extends DemoVehicle {
	// Car knows how to stop but not how to start yet
	@Override
	void stop() {
		System.out.println("Car stops with brakes");
	}
	// start() is still abstract-> so car remains abstract
}

class DemoMaruti extends DemoCar {
	@Override
	void start() {
		System.out.println("Maruti starts with a key");
	}
}

// Main class
public class DemoAbstract {

	public static void main(String[] args) {
		DemoMaruti maruthi = new DemoMaruti();
		maruthi.start();
		maruthi.stop();

	}

}
