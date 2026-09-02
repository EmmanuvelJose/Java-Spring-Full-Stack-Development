import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEven += i; // Add to sumEven if the number is even
            } else {
                sumOdd += i; // Add to sumOdd if the number is odd
            }
        }

        System.out.println("Sum of even numbers from " + start + " to " + end + " is: " + sumEven);
        System.out.println("Sum of odd numbers from " + start + " to " + end + " is: " + sumOdd);

        scanner.close();
    }
}
