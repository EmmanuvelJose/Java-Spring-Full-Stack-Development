package hash;

//Importing HashSet class from Java utility package
import java.util.HashSet;

public class HashCode4 {
    public static void main(String[] args) {
    	
        // Creating a HashSet object to store String elements
        // HashSet automatically avoids duplicate values
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Java");    // Added successfully
        set.add("Python");  // Added successfully
        set.add("Java");    // Duplicate → will NOT be added

        // Printing the HashSet
        // Output will contain only unique elements
        // Order is not guaranteed (unordered collection)
        System.out.println(set);
    }
}