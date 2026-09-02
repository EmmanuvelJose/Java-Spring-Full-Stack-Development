class String2DArray{
	 public static void main(String[] args) {
		String[][] names= {{"J","L","D","S","E"},
						   {"Jose","Leena","Dona","Sona","Emmanuvel"}};
		
		for(String[] rows : names){
			for(String cols: rows){
				System.out.print(cols +"\t");
			}
		System.out.println();
		}
	}
}
		