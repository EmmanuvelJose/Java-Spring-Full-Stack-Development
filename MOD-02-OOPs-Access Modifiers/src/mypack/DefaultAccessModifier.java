package mypack;

import pack.*;
public class DefaultAccessModifier {
	
	public static void main(String[] args) {
		Demo obj = new Demo(); //Compile Time error
		obj.msg(); //Compile Time Error

	}

}
