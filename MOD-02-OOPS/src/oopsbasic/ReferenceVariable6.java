//Updating array values using reference variable
package oopsbasic;

class Demo2 {
	int arrayUpdate(int[] formalArray) {
		formalArray[2] = 99;
		formalArray[4] = 77;
		return 0;
	}
}

public class ReferenceVariable6 {

	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		int[] actualArray = { 1, 2, 3, 4, 5 };

		for (int items : actualArray)
			System.out.print(items + " , "); // printing array

		System.out.println();
		d1.arrayUpdate(actualArray);
		System.out.println();

		for (int items : actualArray)
			System.out.print(items + " , "); // printing array
	}

}
