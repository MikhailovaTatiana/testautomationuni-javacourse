package chapter3;

import java.util.Scanner;

/*
 * IF ELSE Statement.
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive the congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String[] args) {

        // Initialize values we know
        int quota = 10;

        // Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();

        // Make a decision on the path to take - Output
        if (sales >= quota)
            System.out.println("Congrats! You've met your quota!"); // without {} - only 1 statement
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }
}
