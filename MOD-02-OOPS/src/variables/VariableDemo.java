//Instance Variables and Local Variables

package variables;

class Demo {
	public int first; //Instance Variables
	public int second;
	
//Full argument constructor
	Demo(int noF, int noS) { //local variables
		first = noF;
		second = noS;
	}

	//Single argument constructor
	Demo(int x) {
		first = x;
		second = x; // or any logic you want
	}

	//method
	public void trialPrint(int y) { //y of trialPrint is local variable
		int d;
		System.out.println(second);
	}
	
   //method
	public void testPrint(int y) { //y of testPrint is local variable

	}
}

public class VariableDemo {

	public static void main(String[] args) {
		Demo d = new Demo(2);
		System.out.println(d.second);
	}
}
