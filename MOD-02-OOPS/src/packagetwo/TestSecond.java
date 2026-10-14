package packagetwo;

import static packageone.UtilityFirst.COURSE_NAME;
import static packageone.UtilityFirst.square;

public class TestSecond {

	public static void main(String[] args) {
		System.out.println(COURSE_NAME); // Accessing static variable

		System.out.println(square(5)); // Accessing static method
	}

}
