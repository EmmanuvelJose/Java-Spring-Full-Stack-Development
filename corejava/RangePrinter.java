import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
