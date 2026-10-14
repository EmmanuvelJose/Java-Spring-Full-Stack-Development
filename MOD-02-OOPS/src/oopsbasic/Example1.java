//Java program that demonstrates object creation and 
//accessing instance variables using a reference variable

package oopsbasic;

class Students{
    String name;
    int age;
}

public class Example1  {
    public static void main(String[] args) {
        Students s = new Students(); // s = reference variable
        s.name = "John";
        s.age = 20;

        System.out.println(s.name + "  " + s.age);
    }
}
