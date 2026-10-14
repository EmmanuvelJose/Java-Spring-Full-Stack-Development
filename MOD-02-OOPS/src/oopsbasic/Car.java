//java program  to create an object with fields and methods

package oopsbasic;  // package declaration

public class Car {  //class declaration
    String color;   //instance variables or fields
    String model;
    int speed;

    public void accelerate() {  // instance method
        speed += 10;
        System.out.println("Accelerating! Current speed: " + speed);
    }

    public static void main(String[] args) {
       
    	 // Creating an object of the Car class
    	Car myCar = new Car();
        
        // Accessing the object's field and method
        myCar.color = "Red";
        myCar.model = "Sedan";
        myCar.speed = 10;

        System.out.println("My car is a " + myCar.color + " " + myCar.model);
        myCar.accelerate();
    }
}
