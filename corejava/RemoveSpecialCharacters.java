public class RemoveSpecialCharacters{
	public static void main(String a[]){
	//sentence
	String words=new String ("The String ,class is immutable:The String ; is a final class.");
	//remove special characters
	StringTokenizer st = new StringTokenizer(words,",.;:\"");
	
	//create a list to store words without duplicate
	List<String >wordList = new ArrayList<String>();
	//remove duplicate
	while(st.hasMoreTokens()){
		String temp = st.nextToken().toLowerCase();
		if(!wordList.contains(temp)){
			wordList.add(temp);
		}
	}
	
		//sort the list
		Collections.sort(wordList);
		
		//print the list
		for(String str:wordList){
			System.out.println(str);
		}
	}
}