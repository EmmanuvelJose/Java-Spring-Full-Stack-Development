//This program is used to show that final method can't be override

package finalpack;

//Parent class
class Show{
	//final method show()
	public final void show() {
		System.out.println("Hello World");
	}
}

//Child class
class Display extends Show{
	//error because Cannot override the final method from Show
	/*
	 * public void show() {
		System.out.println("Hello");
	}
	*/
}

//Main class
public class FinalMethod {

	public static void main(String[] args) {
		//creating object of Display class
		Display obj = new Display(); //method call
		obj.show();
	}

}
