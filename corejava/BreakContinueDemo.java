class BreakContinueDemo{
	public static void main(String[] args){
		
		System.out.println("Break:");
		
		for(int i=1;i<=10;i++){
			//terminate loop when i is 4
			if(i==4)
				break;
			System.out.println(i);
		}
		
		System.out.println("Continue:");
		
		for(int i=1;i<=10;i++){
			//if the number is 4, skip and continue
			if(i==4)
				continue;
			System.out.println(i);
		}
	}
}