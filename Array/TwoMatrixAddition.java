import java.util.Scanner;
class TwoMatrixAddition{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
	//enter the number of rows and columns in array
		int row1;
		int col1;
		int row2;
		int col2;
		
		System.out.println("enter the number of rows of first array:");
		row1=sc.nextInt();
		System.out.println("enter the number of columns of first array:");
		col1=sc.nextInt();
		
		System.out.println("enter the number of rows of second array:");
		row2=sc.nextInt();
		System.out.println("enter the number of columns of second array:");
		col2=sc.nextInt();
		
	//2D  first array declaration	
		int[][] arr1 = new int[row1][col1];
		
	    System.out.println("Enter the elements into the first array:"); 
		
	//insertion
		for(int i=0;i<row1;i++){
			for(int j=0;j<col1;j++){
			   arr1[i][j]=sc.nextInt();
			}
		}
		
	//2D  second array declaration	
		int[][] arr2 = new int[row2][col2];
		
	    System.out.println("Enter the elements into the second array:"); 
		
	//insertion
		for(int i=0;i<row2;i++){
			for(int j=0;j<col2;j++){
			   arr2[i][j]=sc.nextInt();
			}
		}
        	
	//2D  result  array declaration	
		int[][] arr3 = new int[row1][col1];
		
	if(row1!=row2 || col1!=col2){
	 	System.out.println("cannot add");
		return;
	}
		
	//sum of matrix
		for(int i=0;i<row2;i++){
			for(int j=0;j<col2;j++){
			   arr3[i][j]= arr1[i][j]+arr2[i][j];
			}
		}	
		
		System.out.println("The sum of matrix is:");
		
	//printing the matrix
		for(int i=0;i<row1;i++){
			for(int j=0;j<col1;j++){
			   System.out.print(arr3[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}