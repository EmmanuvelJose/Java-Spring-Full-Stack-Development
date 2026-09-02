import java.util.Scanner;
class TwoDimensionalArray{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	//enter the number of rows and columns in array
		int row;
		int col;
		
		System.out.println("enter the number of rows:");
		row=sc.nextInt();
		System.out.println("enter the number of columns:");
		col=sc.nextInt();
		
	//2D array declaration	
		int[][] arr = new int[row][col];
		
	    System.out.println("Enter the elements into the array:"); 
		
	//insertion
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
			   arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The 2D array is:");
		
	//printing
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
			   System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}