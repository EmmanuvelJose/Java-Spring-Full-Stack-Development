import java.util.Scanner;

class ArithmeticOperation{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int first;
		int second;

		System.out.println("enter the first number:");
		first=scan.nextInt();
		System.out.println("enter the second number:");
		second=scan.nextInt();
		
		System.out.println("Arithmetic Operations");
 		System.out.println("=====================");
		System.out.println("first + Second = "+(first+second));
		System.out.println("first - Second = "+(first-second));
    		System.out.println("first * Second = "+(first*second));
		System.out.println("first / Second = "+(first/second));
		
		}
}
		

		