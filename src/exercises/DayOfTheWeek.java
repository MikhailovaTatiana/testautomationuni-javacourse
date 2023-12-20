package exercises;

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printDay();
    }

    public static int getNumberOfDay() {
        int number;
        do {
            System.out.println("Enter a number from 1 to 7:");
            number = scanner.nextInt();
        } while (number < 1 || number > 7);
        scanner.close();
        return number;
    }

    public static void printDay() {
        int numOfDay = getNumberOfDay();
        for (int i = 0; i < DAYS.length; i++) {
            if (numOfDay == (i + 1)) {
                System.out.println(DAYS[i]);
            }
        }
    }
}
