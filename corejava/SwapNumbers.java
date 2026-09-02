import java.util.Scanner;

class SwapNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int one;
		int two;
		
		System.out.println("enter the first number:");
		one = sc.nextInt();
		System.out.println("enter the Second number:");
		two = sc.nextInt();
		
		System.out.println("Before Swapping: ");
		System.out.println("first number: " + one+  " Second Number: " + two);

		one=one+two;
		two=one-two;
		one=one-two; 
		
		System.out.println("After Swapping: ");
		System.out.println("first number: " + one+  " Second Number: " + two);
	}
}
		