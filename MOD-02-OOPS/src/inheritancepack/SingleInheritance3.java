package inheritancepack;

class SuperClass3{
	
	int rollNo=28;
	
	public void  display(){
		System.out.println("Roll No:"+ rollNo);
	}
}

class SubClass3 extends SuperClass3{
	
	String name="Emmanuvel Jose";
	
	public void print(){
		rollNo=120; 
		System.out.println("Roll No:"+ rollNo + "  Name:"+ name);
		
	}
}

public class SingleInheritance3{

	public static void main(String[] args) {
		
		SuperClass3 sp = new SuperClass3();
		sp.display();
		SubClass3 sc = new SubClass3();
		sc.print();
		sc.display();

	}

}
