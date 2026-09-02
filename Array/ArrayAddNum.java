import java.util.Scanner;
class ArrayAddNum{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);		
	//enter the size of the array and then only declare the array
		int size;
		
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
			arr[i]+=5;
		}
	
	//print	
	    System.out.println("The array is:");
		for(int i=0;i<size;i++){
		   System.out.println(arr[i]);
		}
	}
}