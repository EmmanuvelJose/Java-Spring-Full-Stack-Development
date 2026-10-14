package accesspack;

import accessdemo.Test;

/*
 * This program is used to show that protected members of the class are not
 * accessible from outside the package in non-subclasses
 * 
 */
public class ProtectedOutsideDirectAccess {

	public static void main(String[] args) {
		// compile time error because protected members
		// of the class are not accessible from outside
		// the package in non-subclasses
		obj.display();

	}

}
