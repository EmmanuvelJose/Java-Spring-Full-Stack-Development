package inheritancepack;

class SuperClass2{
	
	int rollNo=28;
	
	public void  display(){
		System.out.println("Roll No:"+ rollNo);
	}
}

class SubClass2 extends SuperClass2{
	
	String name="Emmanuvel Jose";
	
	public void print(){
		System.out.println("Roll No:"+ rollNo + "  Name:"+ name);
	}
}

public class SingleInheritance2{

	public static void main(String[] args) {
		
		SuperClass2 sp = new SuperClass2();
		sp.display();
		SubClass2 sc = new SubClass2();
		sc.print();
		sc.display();

	}

}
