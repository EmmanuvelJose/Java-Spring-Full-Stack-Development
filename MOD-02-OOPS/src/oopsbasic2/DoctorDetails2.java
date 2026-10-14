//main class

package oopsbasic2;

import java.util.Scanner;

public class DoctorDetails2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	     int id;
	     String name;
	     
	     System.out.println("Enter the Doctor ID:");
	     id = sc.nextInt();
	     sc.nextLine();  // consume newline

	     System.out.println("Enter the Doctor Name:");
	     name = sc.nextLine();
	     
	     Doctor2 doctorOne = new Doctor2(id, name);
	     doctorOne.printDetails();
	     
	     sc.close();
	     
	     
	}

}
