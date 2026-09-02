class StringRev{
	public static void main(String[] args){
		
		String str="Emmanuvel";
		char ch;
		String revString=" ";
		
		//using revString
		for(int i=0; i<str.length(); i++){
			ch=str.charAt(i);
			revString = ch +revString;
		}
		System.out.println(revString);
		
		//without using revString
		for(int i=str.length()-1; i>=0; i--){
			ch=str.charAt(i);
			System.out.print(ch);
		}
	}
}
		
		