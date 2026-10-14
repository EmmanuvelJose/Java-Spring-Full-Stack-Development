package interfacepack;

//access modifiers must be public to access the interface in another programs of the package
public interface Employee {

		// Interface is by default public and  abstract

		// All variables declared inside an interface are by default static and final
		static final int x = 100; // static and final are non-access modifiers

		// void doWork(); - not best practice //or
		public abstract void doWork(); // best practice- all methods inside an interface is by default public abstract
		//public is access modifier and abstract is non-access modifiers
}
