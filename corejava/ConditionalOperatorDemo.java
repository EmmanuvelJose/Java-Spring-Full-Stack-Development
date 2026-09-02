class ConditionalOperatorDemo{
   public static void main(String args[]){
      int a=20;
	  int b;
	  
	  b=(a==21)?30:50;
	  System.out.println("a = "+a+"  b  = "+b);
	  
	  a=(b==50)?30:75;
	  System.out.println("a = "+a+"  b  = "+b);
	  
	  a=(b>50)?30:75;
	  System.out.println("a = "+a+"  b  = "+b);
	}
}