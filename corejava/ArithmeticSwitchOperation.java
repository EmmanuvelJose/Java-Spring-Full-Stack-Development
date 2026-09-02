import java.util.Scanner;
class ArithmeticSwitchOperation{
   public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  float one;
	  float two;
	  char operator;
	  System.out.println("Enter the number one:");
	  one=sc.nextFloat();
	  System.out.println("Enter the number two:");
	  two=sc.nextFloat();
	  sc.nextLine();
	  
	  System.out.println("enter the operator");
	  operator=sc.next().charAt(0);
	  
	 switch(operator){
	    case '+':
			System.out.println("SUM=" +(one+two));
			break;
		case '-':
			System.out.println("SUBTRACT=" +(one-two));
			break;
        case '*':
			System.out.println("PRODUCT=" +(one*two));
			break;
        case '/':
			System.out.println("QUOTIENT=" +(one/two));
			break;	
			
	    }
   }
}   
	  