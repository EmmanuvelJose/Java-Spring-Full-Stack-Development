package packagetwo;

import static packageone.Outer.UtilityThird.*;
import static packageone.UtilityFirst.COURSE_NAME;
import static packageone.UtilityFirst.square;

public class TestThird {

	public static void main(String[] args) {
		System.out.println(COURSE_NAME); // Accessing static variable

		System.out.println(square(5)); // Accessing static method
	}

}
