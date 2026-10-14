package inheritancepack;

class SuperClass{
	
	int rollNo=28;
	
	public void  display(){
		System.out.println("Roll No:"+ rollNo);
	}
}

class SubClass extends SuperClass{
	
	String name="Emmanuvel Jose";
	
	public void print(){
		System.out.println("Roll No:"+ rollNo + "  Name:"+ name);
	}
}
public class SingleInheritance{

	public static void main(String[] args) {
		
		SubClass first = new SubClass();
		first.print();

	}

}
