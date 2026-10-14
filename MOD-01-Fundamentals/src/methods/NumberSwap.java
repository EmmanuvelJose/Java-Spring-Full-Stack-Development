package methods;

import java.util.Scanner;

public class NumberSwap {
    
	public static void swap(int first,int second){
		
		first = first + second;
		second = first - second;
		first = first - second;
		
		System.out.println("The Number After Swapping \nFirst = " + first+ " And Second = " + second);
	}
			
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int first;
		int second;		
		
		System.out.println("enter two numbers:");		
		first = sc.nextInt();
		second = sc.nextInt();
		
		System.out.println(" The Number Before Swapping \nFirst = "+ first+ "   And Second = "+ second);
		
		swap(first,second);
		sc.close();
		
	
	}

}
