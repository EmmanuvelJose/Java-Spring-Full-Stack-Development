//Subclass in different package
package accesspacktwo;

import accesspackone.FirstClass;

public class SecondClass extends FirstClass {

	void method() {
		// Access through inheritance
		System.out.println(i); // Public
		System.out.println(j); // Protected-Respect the parent child
								// relationship irrespective
		System.out.println(k); // Private - Not visible
		System.out.println(l); // Default -Not visible

		// Direct Access
		FirstClass cls = new FirstClass();
		System.out.println(cls.i); // Public -Accessible because it is public
		System.out.println(cls.j); // Protected - Not visible
		System.out.println(cls.k); // Private- Not Visible
		System.out.println(cls.l); // Default- Not Visible
	}
}
