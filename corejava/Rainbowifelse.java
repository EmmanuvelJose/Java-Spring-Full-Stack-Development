import java.util.Scanner;
class Rainbowifelse{
   public static void main(String[] args){	   
      char color;
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("enter first letter of the colour");
	  color=sc.next().charAt(0);
	 
	    if(color=='v' || color=='V'){
		  	  System.out.println("Violet");
		}else  if(color=='i' || color=='I'){
		  	  System.out.println("Indigo");	  
		}else  if(color=='b' || color=='B'){
		  	  System.out.println("Blue");	  
		}else  if(color=='g' || color=='G'){
		  	  System.out.println("Green");	  
	    }else  if(color=='y' || color=='Y'){
		  	  System.out.println("Yellow");
	    }else  if(color=='o' || color=='O'){
		  	  System.out.println("Orange");
	    }else  if(color=='r' || color=='R'){
		  	  System.out.println("Red");
		}else{
			System.out.println("Not a Rainbow color");
		}
    }
}