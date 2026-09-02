/* Given two integers no and n
The task is to find the sum of the series 1/no + 2/no^2  +3/no^3 + ..+n/no^n

*/
import java.util.Scanner;
class SeriesSum2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double no; //3
		double n;  //5
		double sum=0d;
		
		
		System.out.println("Enter a no");
		no=sc.nextDouble();
		
		System.out.println("Enter the limit");
		n=sc.nextDouble();
		
		for (int i= 1;i<= n;i++){
            sum += (i / Math.pow(no, i));
        }
		 System.out.println("Sum of the series=" +sum);
	}
}