//Swapping object references

package oopsbasic;

import java.util.Scanner;

class Demo4 {

	int value;

	// Constructor to assign value
	Demo4(int value) {
		this.value = value;
	}

	// Swapping Method (attempts to swap references)
	void swap(Demo4 A, Demo4 B) {
		Demo4 temp = A;
		A = B;
		B = temp;

		// After Swapping
		System.out.println("\nAfter Swapping:");
		System.out.println("C value = " + A.value);
		System.out.println("D value = " + B.value);
	}
}

public class ReferenceVariable8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// User input
		System.out.print("Enter value for object C: ");
		int val1 = sc.nextInt();

		System.out.print("Enter value for object D: ");
		int val2 = sc.nextInt();

		// Creating objects with user input
		Demo4 C = new Demo4(val1);
		Demo4 D = new Demo4(val2);

		// Before Swapping
		System.out.println("\nBefore swapping:");
		System.out.println("C value = " + C.value);
		System.out.println("D value = " + D.value);

		// Attempting to swap references
		C.swap(C, D);

		sc.close();
	}
}
