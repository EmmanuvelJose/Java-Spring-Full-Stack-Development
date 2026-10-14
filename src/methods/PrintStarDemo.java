package methods;

import java.util.Scanner;

public class PrintStarDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome");
		
		for (int i = 1; i <= 60; i++) {
			System.out.print("*");
		}
		System.out.println("\nTo");
		for (int i = 1; i <= 60; i++) {
			System.out.print("*");
		}
		System.out.println("\nLuminar");
		for (int i = 1; i <= 60; i++) {
			System.out.print("*");
		}
		System.out.println("\nKochi");
		for (int i = 1; i <= 60; i++) {
			System.out.print("*");
		}
		scan.close();

	}

}