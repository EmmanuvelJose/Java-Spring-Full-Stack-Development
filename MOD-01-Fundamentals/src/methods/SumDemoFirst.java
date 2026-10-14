package methods;

import java.util.Scanner;

public class SumDemoFirst {

	public static void sum(int first, int no, int second) {

		int result;
		result = first + no + second;
		System.out.println("Result = " + result);
	

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int first;
		
		int second;

		System.out.println("enter 2 numbers:");

		first = sc.nextInt();

		second = sc.nextInt();

		sum(first, 67, second); // sum(int,int,int)
		
		sc.close();

	}

}
