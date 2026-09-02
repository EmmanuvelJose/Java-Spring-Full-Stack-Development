import java.util.Scanner;

class MultiplicationTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int no;
		int start;
		int end;
		
		System.out.println("enter a number:");
		no = sc.nextInt();
		System.out.println("enter the start:");
		start = sc.nextInt();
		System.out.println("enter  the end:");
		end = sc.nextInt();
		
		while(start<=end){
			System.out.println(start +"x"+ no +"=" +(start*no));
			start++;
		}
	}
}
			
		
		