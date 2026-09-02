import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int dayNumber = scanner.nextInt();

        String day;
        switch (dayNumber) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Not a valid day.";
                break;
        }

        System.out.println(day);
        scanner.close();
    }
}
