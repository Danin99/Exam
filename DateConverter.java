import java.util.Scanner;

public class DateConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Extract year, month, and day from the short date
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8, 10));

        // Convert month number to month name
        String monthName = getMonthName(month);

        // Display the full date representation
        System.out.printf("%s %d, %d%n", monthName, day, year);

        scanner.close();
    }

    private static String getMonthName(int month) {
        String[] monthNames = {
            "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month];
        } else {
            return "Invalid Month";
        }
    }
}