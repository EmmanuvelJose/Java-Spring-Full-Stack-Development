class EnhancedForLoopDemo2{
	public static void main(String[] args){
		int[] arr={34,56,78,23};
		
		String[] name={"Jose","Leena","Dona","Sona","Emmanuvel"};
		
		for(int i: arr){
			System.out.println(i);
		}
		
		for(String str : name){
			System.out.println(str);
		}
	}
}