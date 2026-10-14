package inheritancepack;

class SuperClass4{
	
	int rollNo=28;
	
	public void  display(){
		System.out.println("Roll No:"+ rollNo);
	}
}

class SubClass4 extends SuperClass4{
	
	String name="Emmanuvel Jose";
	
	public void print(){
	//	rollNo=120; 
		System.out.println("Roll No:"+ rollNo + "  Name:"+ name);
		rollNo=120;
	}
}

public class SingleInheritance4{

	public static void main(String[] args) {
		
		SuperClass4 sp = new SuperClass4();
		sp.display();
		SubClass4 sc = new SubClass4();
		sc.print();
		sc.display();

	}

}