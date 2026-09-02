import java.util.Scanner;
class Greatest{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int one;
		int two;
		int three;
		System.out.println("enter 3 no:s");
		one =scan.nextInt();
		two =scan.nextInt();
		three =scan.nextInt();
		if(one>two && one>three)
			System.out.println(one + " is greatest");
        else if(two>three)
			System.out.println(two + " is greatest");
		else
			System.out.println(three + " is greatest");
	}
}


		
		