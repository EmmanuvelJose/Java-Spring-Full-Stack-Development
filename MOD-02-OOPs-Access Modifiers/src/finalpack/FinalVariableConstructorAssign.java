//This program is used to show that the value of final variable can't be changed
//Here the value of final variable is initialized in the constructor of the class

package finalpack;

class Example{
	final int instanceVariable;
	
	public Example(int value) {
		this.instanceVariable = value; //Must be initialized in the constructor
	}
	 public void display() {
		 System.out.println("The value of the final instance variable is "+ instanceVariable);
	 }
}

//Main class
public class FinalVariableConstructorAssign {

	public static void main(String[] args) {
		Example ex = new Example(20);
		ex.display();
	}

}
