//Copy constructor using dynamic value

package oopsbasic2;

import java.util.Scanner;

public class AdminDetails {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	     int id;
	     String name;
	     
	     System.out.println("Enter the Admin ID:");
	     id = sc.nextInt();
	     sc.nextLine();  // consume newline

	     System.out.println("Enter the Admin Name:");
	     name = sc.nextLine();
	     
	     Admin first = new Admin(id, name);
	     first.printDetails();
	     
	    // Using copy constructor
	     Admin second = new Admin(first);
	     second.printDetails();
	     
	     sc.close();

	}

}
