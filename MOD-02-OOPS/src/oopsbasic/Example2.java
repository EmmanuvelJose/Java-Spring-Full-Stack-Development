//Java program to define a class Dog with an instance variable breed and a method bark().
//Create an object and call the method.

package oopsbasic;

class Dog {
    String breed;
    
    public void bark() {
        System.out.println("Woof!");
    }
}

public class Example2 {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog(); 
        
        // Accessing the object's field and method
        myDog.breed = "Labrador";
        
        System.out.println(myDog.breed);
        
        myDog.bark(); // Output: Woof!
     
    }
}
