package salt.testautouni.javacourse.chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP
 * Calculate the sum of two numbers
 */
public class AddNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter the first number");
            double num1 = scan.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scan.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is  " + sum);

            System.out.println("Would you like to start over? (true, false)");
            again = scan.nextBoolean();

        } while (again);

        scan.close();
    }
}
