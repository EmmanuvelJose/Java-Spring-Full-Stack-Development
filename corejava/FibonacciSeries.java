import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (N) for the Fibonacci series: ");
        int N = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + N + " terms:");
        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");
            
            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
