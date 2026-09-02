import java.util.Scanner;

class NumberSwap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int one;
		int two;
		int temp;
		
		System.out.println("enter the first number:");
		one = sc.nextInt();
		System.out.println("enter the Second number:");
		two = sc.nextInt();
		
		System.out.println("Before Swapping: ");
		System.out.println("first number: " + one+  " Second Number: " + two);

		temp=one;
		one=two;
		two=temp;
		
		System.out.println("After Swapping: ");
		System.out.println("first number: " + one+  " Second Number: " + two);
	}
}
		
		
		
		
		