class EnhancedForLoopTwoD{
	public static void main(String[] args){
		int[] arr={34,56,78,23};
		
		String[] name={"Jose","Leena","Dona","Sona","Emmanuvel"};
		
		int[][] ar={
						{2,67,3},
						{12,45,2},
						{98,6,31}
					};
		
		//int[][] ar={{2,67,3},{12,45,2},{98,6,31}};
					
		for(int i: arr){
			System.out.println(i);
		}
		
		for(String str : name){
			System.out.println(str);
		}
		
		for(int[] row : ar){
			for(int col : row){
				System.out.print(col + " ");
			}
			System.out.println("");
		}	
	}
}