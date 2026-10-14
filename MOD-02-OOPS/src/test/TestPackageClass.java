package test;

import  packagetest.PackageClass;   //importing PackageClass from PackageTest to test	

import com.luminar.Demo;

public class TestPackageClass {

	public static void main(String[] args) {

		PackageClass pc = new PackageClass();  //Creating an object for class PackageClass
		pc.print();							  //calling a method from the class PackageClass
		
		Demo d = new Demo();
		d.display();

	}

}
