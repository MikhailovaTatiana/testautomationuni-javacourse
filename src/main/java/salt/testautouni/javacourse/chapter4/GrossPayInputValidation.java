package salt.testautouni.javacourse.chapter4;

import java.util.Scanner;

/*
 WHILE LOOP
 Each store employee makes $15 an hour.
 */
public class GrossPayInputValidation {
    public static void main(String[] args) {

        // Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("Hou many hours did you work this week?");
        Scanner scan = new Scanner(System.in);
        double hoursWorked = scan.nextDouble();

        // Validate input
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again.");
            hoursWorked = scan.nextDouble();
        }

        scan.close();

        // Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
