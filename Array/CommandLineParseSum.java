class CommandLineParseSum{
	public static void main(String[] args){
		
	    int sum=0;
		int no=0;
		
		for(int i=0;i<args.length;i++){
			no = Integer.parseInt(args[i]); 
			sum = sum + no;
		}
        
		System.out.println("Sum="+ sum);
	}
}