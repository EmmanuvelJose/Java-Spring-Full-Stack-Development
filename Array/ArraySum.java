import java.util.Scanner;
class ArraySum{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);		
		int size;
		int sum=0;
		
		System.out.println("enter size:");
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
	//insertion    
		for(int i=0;i<size;i++){
			System.out.println("enter a no:");
			arr[i]=sc.nextInt();
		}
		
	//operation		
		for(int i=0;i<size;i++){
			sum=sum+arr[i];
		}
	
	//printing
	    System.out.println("The sum of array is:" + sum);
		
	}
}