//function with arguments with return value

package methods;

import java.util.Scanner;

public class SumDemoThird {

	public static int sum(int first, int no, int second) {

		return first + no + second; // return (first + no + second);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int first;
		int second;
		int result;

		System.out.println("enter 2 numbers:");

		first = sc.nextInt();

		second = sc.nextInt();

		result = sum(first, 67, second); // sum(int,int,int)

		System.out.println("Result = " + result);

		sc.close();

	}

}
