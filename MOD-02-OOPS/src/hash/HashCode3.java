//HashMap Program

package hash;

//Importing the HashMap class from Java utility package
import java.util.HashMap;

public class HashCode3 {
    public static void main(String[] args) {
    	
    	// Creating a HashMap object
        // Integer → Key type
        // String → Value type
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        // put(key, value)
        map.put(1, "Apple");    
        map.put(2, "Banana");   
        map.put(3, "Mango");    

        // Retrieving value using key
        // get(key) returns the value associated with the key
        System.out.println(map.get(2)); 
    }
}