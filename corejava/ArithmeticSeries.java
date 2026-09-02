import java.util.Scanner;
public class ArithmeticSeries{  
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int a1;  // First term  
        int d;   // Common difference  
        int n;   // Number of terms  
		
		System.out.println("Enter the first term:");
		a1=sc.nextInt();
		
		System.out.println("Enter the common difference:");
		d=sc.nextInt();
		
		System.out.println("Enter the number of terms");
		n=sc.nextInt();
		
		System.out.println("Arithmetic Series is:");
		
        for (int i = 0; i < n; i++) {  
            int term = a1 + i * d;  
            System.out.print(term + " ");  
        }  
    }  
} 