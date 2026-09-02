import java.util.*;
class Studentdetails{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int rollno;
		String name;
		float mark;
		char letter;
		
		System.out.println("Enter roll number :");
		rollno=scan.nextInt();
		
		scan.nextLine(); 
		
		System.out.println("Enter name :");
		name=scan.nextLine();
		
		System.out.println("Enter mark :");
		mark=scan.nextFloat();
		
		System.out.println("Enter the first letter of your name:");
		letter=scan.next().charAt(0);
		
		System.out.println("Student Details\n ==================\nRoll No\t\t" +rollno+ "\n Name\t\t" +name+ 
		"\nMark\t\t" +mark+ "\nLetter\t\t" +letter);
				
	}	
}

/*System.out.println("Roll number :"+ rollno);
		System.out.println("Name :" + name);
		System.out.println("Mark :" + mark);*/	




/*import java.util.*;
class Student{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int RollNo;
		String Name;
		float Mark;
	
		System.out.println("enter the RollNo:");
		RollNo = scan.nextInt();
		scan.nextLine();
		System.out.println("enter the Name:");
		Name = scan.nextLine();
		System.out.println("enter the Mark:");
		Mark = scan.nextFloat();
		System.out.println("Student Details:");
		System.out.println("Roll No:" +RollNo + "  Name:" + Name +  "  Marks:" +Mark);
	}
}
*/

