//function with arguments with return value

package methods;

import java.util.Scanner;

public class SumDemoFourth {

	public static int sum(int first, int no, int second) {

		return first + no + second; // return (first + no + second);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int first;
		int second;

		System.out.println("enter 2 numbers:");

		first = sc.nextInt();

		second = sc.nextInt();

		System.out.println("Result = " + sum(first, 67, second));

		sc.close();

	}

}
