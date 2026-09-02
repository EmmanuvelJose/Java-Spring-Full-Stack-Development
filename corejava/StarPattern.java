import java.util.Scanner;
class StarPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int no;
		
		System.out.println("enter the limit");
		no=sc.nextInt();
		
		for(int i=1;i <= no; i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}