package stringpack;

import java.util.StringTokenizer;

public class void Main{String[] args){
    StringTokenizer st= new StringTokenizer("Luminar-Tecnolab,kakkanad=kochi","-,");

    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());

      }
  }
    
}
