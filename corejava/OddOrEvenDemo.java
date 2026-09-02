import java.util.Scanner;
class  OddOrEvenDemo{
	public static void main(String args[]){
		Scanner  scan = new Scanner(System.in);
		int num;
		System.out.println("enter num");
		num = scan.nextInt();
		if(num%2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
		}
	}