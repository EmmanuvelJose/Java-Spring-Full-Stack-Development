import java.util.Scanner;
class ArrayEvenOddCount{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		int evenCount=0;
		int oddCount=0;
	    
		for(int i=0;i<5;i++){
			System.out.println("enter a no:");
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<5;i++){
			if(arr[i]%2==0)
			    evenCount++;
			else
				oddCount++;
		}
		System.out.println("even no count: " + evenCount);
		System.out.println("odd no count: " + oddCount);
	}
}