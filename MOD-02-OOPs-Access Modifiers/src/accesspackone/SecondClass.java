//Sub Class in same package

package accesspackone;

class SecondClass extends FirstClass {
	void method() {
		// Access through inheritance

		System.out.println(i); // public
		System.out.println(j); // protected-Respect the parent child
								// relationship irrespective
		System.out.println(k); // private-not visible
		System.out.println(l); // Default-Accessible as it is in package

		// Direct Access
		FirstClass cls = new FirstClass();

		System.out.println(cls.i); // public
		System.out.println(cls.j); // protected
		System.out.println(cls.l); // Default
		System.out.println(cls.k); // Private-not visible
	}
}
