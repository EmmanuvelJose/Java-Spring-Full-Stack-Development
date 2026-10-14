//Final class cannot be inherited by a subclass

package finalpack;

//Parent class
final class Trail{
	public void show() {
		System.out.println("Hello world");
	}
}

//Child class
/* The type Demo cannot subclass the final class Trail
class Demo extends Trail{
	public void show() {
		System.out.println("hiii");
	}
}
*/

//Main class
public class FinalClass {

	public static void main(String[] args) {
		//Demo obj = new Demo();
		//obj.show();
		
		Trail t = new Trail();
		t.show();
		
	}

}
