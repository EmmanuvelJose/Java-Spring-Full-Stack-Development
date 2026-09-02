import java.util.Scanner;

public class MultiplicationTableUsingFor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the starting range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending range: ");
        int end = scanner.nextInt();

        System.out.println("Multiplication table of " + number + " from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
