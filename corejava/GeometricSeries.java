import java.util.Scanner;
public class GeometricSeries{  
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        double a1;     // First term  
        double r;      // Common ratio  
        int n;         // Number of terms  
		double term;   // next term
	   
	    System.out.println("Enter the first term");
		a1=sc.nextDouble();
		
		System.out.println("Enter the common ratio");
		r=sc.nextDouble();
		
		System.out.println("Enter the number of terms");
		n=sc.nextInt();
		
		for (int i=0;i<n;i++){  
            term = a1 * Math.pow(r, i);  
            System.out.print(term + " ");  
        }  
    }  
}  