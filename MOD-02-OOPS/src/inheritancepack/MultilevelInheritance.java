package inheritancepack;

//class 1
class College{
	
	String collegeName="VJCET";
	
	public void pri(){
		System.out.println("College Name="+ collegeName );
	}
	
}

//class 2
class Course extends College{
	String courseName="BTech";
	
	public void print(){
		System.out.println("College Name="+ collegeName + "  Course Name="+courseName);
	}
}

//class 3
class Student extends Course{
	String name="Emmanuvel Jose";
	public void printId(){
		System.out.println("College Name="+ collegeName + "  Course Name="+courseName +"  Name="+ name);
	}
}

//Main Class
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Student s = new  Student();
		 s.printId();
		 s.print();
		 s.pri();

	}

}
