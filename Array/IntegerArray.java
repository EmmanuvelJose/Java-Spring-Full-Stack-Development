import java.util.Scanner;

class IntegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter array size:");
        size = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        int[] num = new int[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        // Printing
        System.out.println("The array elements are:");
        for (int  i : num) {
            System.out.println(i);
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}

