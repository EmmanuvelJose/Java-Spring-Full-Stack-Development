import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i=1;
		int no;
		int temp=1;
		 
		System.out.println("Enter number  no");
		no=sc.nextInt();
			
		while(i<=no){
			temp=temp*i;
			i++;
		}
		System.out.println("Factorial of "+no+"=" +temp);
	}
}
