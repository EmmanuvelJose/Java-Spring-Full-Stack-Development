package oops;

import java.util.*;

public class NextVersusNextLine{
	public static void main(String[] args){
		
		
		String sampleText=
		    "Programmers love java!\n"
	        +"User input with java is so easy!\n"
		    +"just use the Scanner class.\n"
	     	+"or maybe the console or JoptionPane?\n";
		
		Scanner scanner = new Scanner(sampleText);
		
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		
		Scanner scan=new Scanner(sampleText);
		
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
	    
		scanner.close();
		scan.close();
	}
}
