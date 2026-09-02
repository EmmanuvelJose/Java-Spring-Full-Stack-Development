import java.util.Scanner;
class ArrayDemo2{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
	    
		for(int i=0;i<5;i++){
			System.out.println("enter a no:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array is:");
		
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}