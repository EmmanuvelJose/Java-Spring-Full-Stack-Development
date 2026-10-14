//Final Method Parameter

package finalpack;

class TestFinalParameter{
	public void showValue(final int num) {
		//num=num*5;  The final local variable num cannot be reassigned
		System.out.println("Num = "+ num);
	}
}

public class FinalParameter {

	public static void main(String[] args) {
		TestFinalParameter obj = new TestFinalParameter();
		obj.showValue(25);	
	}
}
