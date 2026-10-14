//Instance Variables, Static Variables and Local Variables

package variables;

class Student {
	
	int rollNo; // rollNo is an instance variable
	private String name; // name is an instance variable with access modifier
	static int mark; // mark is static variable

	//block
	{
		
	}
	
	//constructor
	Student() {	
		rollNo = 123;
		name = "Emmanuvel";
	}

	//method
	public void display() {
		
		int y = 5; // y is a local variable
		
		System.out.println("\nDisplay method of class Student: Value of instance variables\n=======");
		System.out.println("Value of local variable y=" + y);
		System.out.println("RollNo=" + rollNo);
		System.out.println("Name=" + name);
		System.out.println("Static variable Mark=" + mark);
	}
}

public class VariablesInClass {
	
	public static void main(String[] arg) {
		
		System.out.println("In main() method:\n==============================");
		
		for(int i=1;i<2;i++) {//i is a local variable
			System.out.println("in loop : i="+i);			
		}
		
		Student.mark=456;
		
		System.out.println("Static variable assigned value in main(): Mark="+Student.mark); //static variables are accessed by Classname.Variablename
		
		Student obj=new Student();
		
		//System.out.println(obj.mark); not static way
		System.out.println(Student.mark);  // static way
		
		obj.display();
		
	}
}
