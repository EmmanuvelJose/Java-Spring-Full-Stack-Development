import java.util.Scanner;

class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter array size:");
        size = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        String[] name = new String[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            name[i] = sc.nextLine();
        }

        // Printing
        System.out.println("The array elements are:");
        for (String str : name) {
            System.out.println(str);
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}

