import java.util.Scanner;

public class pgm8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting year: ");
        int startYear = scanner.nextInt();
        System.out.print("Enter the ending year: ");
        int endYear = scanner.nextInt();
        System.out.println("Leap years within the range " + startYear + " to " + endYear + " are:");
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }

        scanner.close();
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
