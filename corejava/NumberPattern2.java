import java.util.Scanner;
class NumberPattern2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("enter the limit:");
		n=sc.nextInt();
		
		//Loop to iterate over each row
		for(int i=1; i<=n; i++){
			//Loop to iterate over each column of the ith row
			for(int j=1;j<=i;j++){
				System.out.print(j+ " "); 
			}
			System.out.println();
		
		}
	}
}





















class Main {
	public static void main(String args[]) {
		int n = 5;
		//Loop to iterate over each row
		for(int i=1;i<=n;i++){
			//Loop to iterate over each column of the ith row
			for(int j=1;j<=i;j++){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}
	}
}
