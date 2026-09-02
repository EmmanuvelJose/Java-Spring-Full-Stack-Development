import java.util.Scanner;
class ArrayEven{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
	    
		for(int i=0;i<5;i++){
			System.out.println("enter a no:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The even numbers:");
		
		for(int i=0;i<5;i++){
			if(arr[i]%2==0)
			 System.out.println(arr[i]);
		}
	}
}