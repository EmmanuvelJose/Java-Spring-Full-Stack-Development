//Copy constructor using direct value

package oopsprg;

class Admin{
	//class data members
	int enroll;
	String name;
	
	//parameterized constructor
	public Admin(int roll,String na){
		enroll = roll;
		name=na;
	}
	
	//copy constructor
	Admin(Admin ad){
		enroll = ad.enroll;
		name= ad.name;
	}
	
	public void printDetails(){
		System.out.println("enroll="+ enroll + "\tName="+ name);		
	}
	
}

public class CopyConstructorTest {

	public static void main(String[] args) {
		
		Admin first = new Admin(23,"bini");
		//first.printDetails(); //or
		System.out.println("Enroll="+ first.enroll + "\tName="+ first.name);
		
		Admin second = new Admin(first);
		second.printDetails();
	}

}
