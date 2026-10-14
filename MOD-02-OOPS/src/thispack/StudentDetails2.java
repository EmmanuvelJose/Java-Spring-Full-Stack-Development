// with using 'this' keyword

package thispack;

class Student2{
	
	//Instance Variables
	int roll; 
	String name;
	
	//using this keyword
	Student2(int roll,String name){ 
		this.roll  = roll; //local variables
		this.name = name;
	}
	
	public void print(){
		System.out.println(roll + "    " + name);
	}
}

// main class
public class StudentDetails2{

	public static void main(String[] args) {
		Student s = new Student(2, "Emmanuvel");
		s.print();
	}

}

